package rhsu.board.basic.implementations.arithmetic;

import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.Random;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board2.randomGenerators.RandomGenerator;
import rhsu.board.basic.AbstractBasicMatrix;
import rhsu.board.Matrix;
import rhsu.board.exceptionHandler.HandleType;
import rhsu.board.utilities.UtilityFunctions;

/**
 *A big integer implementation
 */
public class BigIntegerBoard extends AbstractBasicMatrix<BigInteger>
{
	private static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
	/**
	 * Constructor to create a BigIntegerBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	public BigIntegerBoard(int h, int v)
	{
		this(h, v, DEFAULT_VALUE);
	}
	
	@SuppressWarnings({"unchecked"})
	public BigIntegerBoard(int h, int v, BigInteger defaultValue)
	{
		super(h, v, defaultValue);
		this.defaultValue = DEFAULT_VALUE;
	}
	
	public BigIntegerBoard(String filename)
	{
		this(filename, HandleType.RuntimeError, DEFAULT_VALUE);
	}
		
	public BigIntegerBoard(String filename, BigInteger defaultValue)
	{
		this(filename, HandleType.Ignore, defaultValue);
	}
		
	public BigIntegerBoard(String filename, HandleType handleType, BigInteger defaultValue)
	{
		super(filename);
		this.defaultValue = DEFAULT_VALUE;
	}
	
	public BigIntegerBoard(BufferedReader bufferedReader)
	{
		this(bufferedReader, HandleType.RuntimeError, null);
	}
	
	public BigIntegerBoard(BufferedReader bufferedReader, BigInteger defaultValue)
	{
		this(bufferedReader, HandleType.Ignore, defaultValue);
	}
			
	public BigIntegerBoard(BufferedReader bufferedReader, HandleType handleType, BigInteger defaultValue)
	{
		super(bufferedReader);
		this.defaultValue = DEFAULT_VALUE;
	}
	//</editor-fold>
		
	@Override
	public BigIntegerBoard add(Matrix<BigInteger> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.ADD, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigIntegerBoard result =  new BigIntegerBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigInteger a = this.getValueAt(i, j);
				BigInteger b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a.add(b));
			}
		}
		
		return result;
	}

	@Override
	public BigIntegerBoard subtract(Matrix<BigInteger> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SUBTRACT, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigIntegerBoard result =  new BigIntegerBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigInteger a = this.getValueAt(i, j);
				BigInteger b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a.subtract(b));
			}
		}
		
		return result;
	}

	@Override
	public BigIntegerBoard multiply(Matrix<BigInteger> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.MULTIPLY, m);
		
		int h = this.getHorizontal_size();
		int v = m.getVertical_size();
		
		BigIntegerBoard result = new BigIntegerBoard(h, v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigInteger sum = BigInteger.ZERO;
				
				for(int k = 0; k < this.getVertical_size(); k++)
				{
					BigInteger tempValue = this.getValueAt(i, k).multiply(m.getValueAt(k, j));
					sum = sum.add(result.getValueAt(i, j))
							.add(tempValue);
				}
				
				result.setValueAt(i, j, sum);
			}
		}
		return result;
	}

	@Override
	public BigIntegerBoard multiply(BigInteger scalar) 
	{
		BigIntegerBoard result = new BigIntegerBoard(this.horizontal_size,
				this.vertical_size);
		
		for(int h = 0; h < this.horizontal_size; h++)
		{
			for(int v = 0; v < this.vertical_size; v++)
			{
				BigInteger m = this.getValueAt(h, v);
				result.setValueAt(h, v, m.multiply(scalar));
			}
		}
		
		return result;
	}
	
	@Override
	public BigIntegerBoard inverse() 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SQUAREMATRIX);

		BigIntegerBoard inverseMatrix = this.cofactor().transpose();
		
		return inverseMatrix.multiply(BigInteger.ONE.divide(this.determinant()));
	}

	@Override
	public BigInteger determinant() 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SQUAREMATRIX);

		if(this.horizontal_size == 1) return this.getValueAt(0, 0);
		
		if(this.horizontal_size == 2)
		{
			BigInteger a = this.getValueAt(0, 0);
			BigInteger b = this.getValueAt(1, 1);
			BigInteger c = this.getValueAt(0, 1);
			BigInteger d = this.getValueAt(1, 0);
			
			BigInteger result = a.multiply(b);
			BigInteger result2 = c.multiply(d);
			
			return result.subtract(result2);
			
			//return (this.getValueAt(0, 0) * this.getValueAt(1, 1)) - ( this.getValueAt(0, 1) * this.getValueAt(1, 0));
		}
		
		BigInteger sum = BigInteger.ZERO;
		
		for (int i = 0; i < this.horizontal_size; i++) 
		{
			Integer x = UtilityFunctions.changeSign(i);
			sum = sum.add(new BigInteger(x.toString()));
			//sum = sum 
			//		+ UtilityFunctions.changeSign(i) 
			//		* this.getValueAt(0, i) 
			//		* createSubMatrix(0, i).determinant();
			
			BigInteger b1 = this.getValueAt(0, i);			
			BigInteger b2 = createSubMatrix(0,i).determinant();
			BigInteger b3 = b1.multiply(b2);
			
			sum = sum.multiply(b3);
		}
		
		return sum;
	}
	
	@Override
	public BigIntegerBoard transpose()
	{
		int h = this.horizontal_size;
		int v = this.vertical_size;
		BigIntegerBoard result = new BigIntegerBoard(v, h);
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
	public BigIntegerBoard createSubMatrix(int excluding_row, int excluding_column) 
	{
		BigIntegerBoard result = new BigIntegerBoard(this.horizontal_size-1,
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
	public BigIntegerBoard cofactor() 
	{
		BigIntegerBoard result = new BigIntegerBoard(this.horizontal_size, 
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
				BigInteger bSignI = new BigInteger(signI.toString());
				Integer signJ = UtilityFunctions.changeSign(j);
				BigInteger bSignJ = new BigInteger(signJ.toString());
				
				BigInteger value = bSignI
						.multiply(bSignJ)
						.multiply(createSubMatrix(i, j).determinant());
				
				result.setValueAt(i, j, value);
			}
		}
		
		return result;
	}

	@Override
	public RandomGenerator<BigInteger> randomGenerator() 
	{
		RandomGenerator<BigInteger> generator = new RandomGenerator()
		{
			Random random = new Random();
			
			@Override
			public BigInteger getRandom() 
			{
				return new BigInteger(new Integer(random.nextInt()).toString());
			}	
		};
		return generator;
	}
	
	//<editor-fold desc="BoardIO Methods" defaultstate="collapsed">

	@Override
	public void initializeFromBaseBoard()
	{		
		BigInteger value = null;
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					value = new BigInteger(baseBoard.getValueAt(i,j));
				}
				catch(Exception exception)
				{
					value = handler.AssignDefault(exception, handleType, defaultValue);
				}
				finally
				{
					board[i][j] = new BasicBoardPiece(i, j, value, this.uuid);
				}
			}
		}
	}
	
	//</editor-fold>
	
	@Override
	public BigInteger getDefaultValue()
	{
		return DEFAULT_VALUE;
	}
}
