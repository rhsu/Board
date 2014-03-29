package rhsu.board.basic.implementations.arithmetic;

import java.io.BufferedReader;
import java.math.BigDecimal;
import java.util.Random;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board.RandomGenerator;
import rhsu.board.basic.AbstractBasicMatrix;
import rhsu.board.Matrix;
import rhsu.board.exceptionHandler.HandleType;
import rhsu.board.utilities.UtilityFunctions;

/**
 *A big decimal implementation
 */
public class BigDecimalBoard extends AbstractBasicMatrix<BigDecimal>
{	
	private static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
	/**
	 * Constructor to create a BigDecimalBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	public BigDecimalBoard(int h, int v)
	{
		this(h, v, DEFAULT_VALUE);
	}
	
	@SuppressWarnings({"unchecked"})
	public BigDecimalBoard(int h, int v, BigDecimal defaultValue)
	{
		super(h, v, defaultValue);
	}
	
	public BigDecimalBoard(String filename)
	{
		this(filename, HandleType.RuntimeError, DEFAULT_VALUE);
	}
	
	public BigDecimalBoard(String filename, BigDecimal defaultValue)
	{
		this(filename, HandleType.Ignore, defaultValue);
	}
	
	@SuppressWarnings({"unchecked"})
	public BigDecimalBoard(String filename, HandleType handleType, BigDecimal defaultValue)
	{
		super(filename);
	}
	
	public BigDecimalBoard(BufferedReader bufferedReader)
	{
		this(bufferedReader, HandleType.RuntimeError, DEFAULT_VALUE);
	}		
			
	public BigDecimalBoard(BufferedReader bufferedReader, BigDecimal defaultValue)
	{
		this(bufferedReader, HandleType.Ignore, defaultValue);
	}
			
	public BigDecimalBoard(BufferedReader bufferedReader, HandleType handleType, BigDecimal defaultValue)
	{
		super(bufferedReader);
	}
	//</editor-fold>
		
	@Override
	public BigDecimalBoard add(Matrix<BigDecimal> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.ADD, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigDecimalBoard result =  new BigDecimalBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigDecimal a = this.getValueAt(i, j);
				BigDecimal b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a.add(b));
			}
		}
		
		return result;
	}

	@Override
	public BigDecimalBoard subtract(Matrix<BigDecimal> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SUBTRACT, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigDecimalBoard result =  new BigDecimalBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigDecimal a = this.getValueAt(i, j);
				BigDecimal b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a.subtract(b));
			}
		}
		
		return result;
	}

	@Override
	public BigDecimalBoard multiply(Matrix<BigDecimal> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.MULTIPLY, m);
		
		int h = this.getHorizontal_size();
		int v = m.getVertical_size();
		
		BigDecimalBoard result = new BigDecimalBoard(h, v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigDecimal sum = BigDecimal.ZERO;
				
				for(int k = 0; k < this.getVertical_size(); k++)
				{
					BigDecimal tempValue = this.getValueAt(i, k).multiply(m.getValueAt(k, j));
					sum = sum.add(result.getValueAt(i, j))
							.add(tempValue);
				}
				
				result.setValueAt(i, j, sum);
			}
		}
		
		return result;
	}

	@Override
	public BigDecimalBoard multiply(BigDecimal scalar) 
	{
		BigDecimalBoard result = new BigDecimalBoard(this.horizontal_size,
				this.vertical_size);
		
		for(int h = 0; h < this.horizontal_size; h++)
		{
			for(int v = 0; v < this.vertical_size; v++)
			{
				BigDecimal m = this.getValueAt(h, v);
				result.setValueAt(h, v, m.multiply(scalar));
			}
		}
		
		return result;
	}
	
	@Override
	public BigDecimalBoard inverse() 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SQUAREMATRIX);

		BigDecimalBoard inverseMatrix = this.cofactor().transpose();
		
		return inverseMatrix.multiply(BigDecimal.ONE.divide(this.determinant()));
	}

	@Override
	public BigDecimal determinant() 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SQUAREMATRIX);

		if(this.horizontal_size == 1) return this.getValueAt(0, 0);
		
		if(this.horizontal_size == 2)
		{
			BigDecimal a = this.getValueAt(0, 0);
			BigDecimal b = this.getValueAt(1, 1);
			BigDecimal c = this.getValueAt(0, 1);
			BigDecimal d = this.getValueAt(1, 0);
			
			BigDecimal result = a.multiply(b);
			BigDecimal result2 = c.multiply(d);
			
			return result.subtract(result2);
			
			//return (this.getValueAt(0, 0) * this.getValueAt(1, 1)) - ( this.getValueAt(0, 1) * this.getValueAt(1, 0));
		}
		
		BigDecimal sum = BigDecimal.ZERO;
		
		for (int i = 0; i < this.horizontal_size; i++) 
		{
			Integer x = UtilityFunctions.changeSign(i);
			sum = sum.add(new BigDecimal(x.toString()));
			//sum = sum 
			//		+ UtilityFunctions.changeSign(i) 
			//		* this.getValueAt(0, i) 
			//		* createSubMatrix(0, i).determinant();
			
			BigDecimal b1 = this.getValueAt(0, i);			
			BigDecimal b2 = createSubMatrix(0,i).determinant();
			BigDecimal b3 = b1.multiply(b2);
			
			sum = sum.multiply(b3);
		}
		
		return sum;
	}
	
	@Override
	public BigDecimalBoard transpose()
	{
		int h = this.horizontal_size;
		int v = this.vertical_size;
		BigDecimalBoard result = new BigDecimalBoard(v, h);
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				result.setValueAt(j, i, this.getValueAt(i, j));
			}
		}
		return result;
	}

	@Override
	public BigDecimalBoard createSubMatrix(int excluding_row, int excluding_column) 
	{
		BigDecimalBoard result = new BigDecimalBoard(this.horizontal_size-1,
				this.vertical_size-1);
	
		int r = -1;
		
		for(int i = 0; i < this.horizontal_size; i++)
		{
			if(i == excluding_row) 
				continue;
				r++;	
				int c = -1;
			
			for(int j = 0; j < this.vertical_size; j++)
			{
				if(j == excluding_column) continue;
				
				result.setValueAt(r, ++c, this.getValueAt(i,j));
			}
		}
		
		return result;
	}

	@Override
	public BigDecimalBoard cofactor() 
	{
		BigDecimalBoard result = new BigDecimalBoard(this.horizontal_size, 
				this.vertical_size);
		
		for(int i = 0; i < this.horizontal_size; i++)
		{
			for(int j = 0; j < this.vertical_size; j++)
			{
				//result.setValueAt(i, j, 
				//		UtilityFunctions.changeSign(i) 
				//		* UtilityFunctions.changeSign(j)
				//		* createSubMatrix(i, j).determinant());
				
				Integer signI = UtilityFunctions.changeSign(i);
				BigDecimal bSignI = new BigDecimal(signI.toString());
				Integer signJ = UtilityFunctions.changeSign(j);
				BigDecimal bSignJ = new BigDecimal(signJ.toString());
				
				BigDecimal value = bSignI
						.multiply(bSignJ)
						.multiply(createSubMatrix(i, j).determinant());
				
				result.setValueAt(i, j, value);
			}
		}
		
		return result;
	}

	@Override
	public RandomGenerator<BigDecimal> randomGenerator() 
	{
		RandomGenerator<BigDecimal> generator = new RandomGenerator()
		{
			Random random = new Random();
			
			@Override
			public BigDecimal getRandom() 
			{
				return new BigDecimal(random.nextDouble());
			}
		};
		return generator;
	}
	
	//<editor-fold desc="BoardIO Methods" defaultstate="collapsed">

	@Override
	public void initializeFromBaseBoard()
	{		
		BigDecimal value = null;
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					value = new BigDecimal(baseBoard.getValueAt(i, j));
				}
				catch(Exception exception)
				{					
					value = handler.AssignDefault(exception, handleType, defaultValue);
				}
				finally
				{
					board[i][j] = new BasicBoardPiece(i, j, value, this.guid);
				}
			}
		}
	}
	
	//</editor-fold>
	
	@Override
	public BigDecimal getDefaultValue()
	{
		return DEFAULT_VALUE;
	}
}
