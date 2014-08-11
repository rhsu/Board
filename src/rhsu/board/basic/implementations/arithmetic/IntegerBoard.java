package rhsu.board.basic.implementations.arithmetic;

import java.io.BufferedReader;
import java.util.Random;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board2.randomGenerators.RandomGenerator;
import rhsu.board.basic.AbstractBasicMatrix;
import rhsu.board.Matrix;
import rhsu.board.exceptionHandler.HandleType;
import rhsu.board.utilities.UtilityFunctions;

/**
 * An integer implementation
 */
public class IntegerBoard extends AbstractBasicMatrix<Integer>
{
	private static final Integer DEFAULT_VALUE = 0;
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
	/**
	 * Constructor to create a IntegerBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 * @param defaultValue the default value
	 */
	@SuppressWarnings({"unchecked"})
	public IntegerBoard(int h, int v, Integer defaultValue)
	{
		super(h, v, defaultValue);
	}
	
	public IntegerBoard(int h, int v)
	{
		this(h, v, DEFAULT_VALUE);
	}
	
	public IntegerBoard(String filename)
	{		
		this(filename, HandleType.RuntimeError, DEFAULT_VALUE);
	}
	
	public IntegerBoard(String filename, Integer defaultValue)
	{
		this(filename, HandleType.Ignore, defaultValue);
	}
		
	@SuppressWarnings({"unchecked"})
	public IntegerBoard(String filename, HandleType handleType, Integer defaultValue)
	{
		super(filename);
		this.defaultValue = DEFAULT_VALUE;
	}

	public IntegerBoard(BufferedReader bufferedReader)
	{
		this(bufferedReader, HandleType.RuntimeError, DEFAULT_VALUE);
	}
	
	public IntegerBoard(BufferedReader bufferedReader, Integer defaultValue)
	{
		this(bufferedReader, HandleType.Ignore, defaultValue);
	}
	
	public IntegerBoard(BufferedReader bufferedReader, HandleType handleType, Integer defaultValue)
	{
		super(bufferedReader);
		this.defaultValue = DEFAULT_VALUE;
	}
	
	//</editor-fold>	
	
	@Override
	public IntegerBoard add(Matrix<Integer> m) 
	{	
		CheckDimensions(AbstractBasicMatrix.OperationType.ADD, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		IntegerBoard result =  new IntegerBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				Integer a = this.getValueAt(i, j);
				Integer b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a+b);
			}
		}
		
		return result;
	}

	@Override
	public IntegerBoard subtract(Matrix<Integer> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SUBTRACT, m);
		
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		IntegerBoard result =  new IntegerBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				Integer a = this.getValueAt(i, j);
				Integer b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a-b);
			}
		}
		
		return result;
	}

	@Override
	public IntegerBoard multiply(Matrix<Integer> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.MULTIPLY, m);
		
		int h = this.getHorizontal_size();
		int v = m.getVertical_size();
		
		IntegerBoard result = new IntegerBoard(h, v);
		
		for(int i = 0 ; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				int sum = 0;
				for(int k = 0; k < this.getVertical_size(); k++)
				{
					sum += result.getValueAt(i, j) 
							+ this.getValueAt(i, k) * m.getValueAt(k, j);
				}
				result.setValueAt(i, j, sum);
			}
		}
		
		return result;
	}

	@Override
	public IntegerBoard multiply(Integer scalar) 
	{
		IntegerBoard result = new IntegerBoard(this.horizontal_size, this.vertical_size);
		
		for(int h = 0; h < this.horizontal_size; h++)
		{
			for(int v = 0; v < this.vertical_size; v ++)
			{
				Integer m = this.getValueAt(h, v);
				result.setValueAt(h, v, m*scalar);
			}
		}
		
		return result;
	}
        
	@Override
	public IntegerBoard inverse() 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SQUAREMATRIX);

		IntegerBoard inverseMatrix = this.cofactor().transpose();
		
		return inverseMatrix.multiply(1/this.determinant());
	}

	@Override
	public Integer determinant() 
	{	
		CheckDimensions(AbstractBasicMatrix.OperationType.SQUAREMATRIX);

		if(this.horizontal_size == 1) return this.getValueAt(0, 0);
		
		if(this.horizontal_size == 2)
		{
			return (this.getValueAt(0, 0) * this.getValueAt(1, 1)) - ( this.getValueAt(0, 1) * this.getValueAt(1, 0));
		}
		
		Integer sum = 0;
		
		for (int i = 0; i < this.horizontal_size; i++) 
		{
			sum += UtilityFunctions.changeSign(i) 
					* this.getValueAt(0, i) 
					* createSubMatrix(0, i).determinant();
		}
		
		return sum;
	}
	
	@Override
	public IntegerBoard transpose()
	{
		int h = this.horizontal_size;
		int v = this.vertical_size;
		IntegerBoard result = new IntegerBoard(v, h);
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
	public IntegerBoard createSubMatrix(int excluding_row, int excluding_column)
	{
		IntegerBoard result = new IntegerBoard(this.horizontal_size-1,
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
	public IntegerBoard cofactor()
	{
		IntegerBoard result = new IntegerBoard(this.horizontal_size, 
				this.vertical_size);
		
		for(int i = 0; i < this.horizontal_size; i++)
		{
			for(int j = 0; j < this.vertical_size; j++)
			{
				result.setValueAt(i, j, 
						UtilityFunctions.changeSign(i) 
								* UtilityFunctions.changeSign(j)
								* createSubMatrix(i, j).determinant());
			}
		}
		
		return result;
	}

	@Override
	public RandomGenerator<Integer> randomGenerator() 
	{	
		RandomGenerator<Integer> generator = new RandomGenerator()
		{
			Random random = new Random();
			
			@Override
			public Integer getRandom() 
			{
				return random.nextInt();
			}	
		};
		return generator;
	}
	
	//<editor-fold desc="BoardIO Methods" defaultstate="collapsed">

	@Override
	public void initializeFromBaseBoard()
	{		
		Integer value = null;
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{				
				if(baseBoard.getPieceAt(i,j).getValue().equalsIgnoreCase("true"))
				{
					value = 1;
				}
				else if(baseBoard.getPieceAt(i, j).getValue().equalsIgnoreCase("false"))
				{
					value = 0;
				}
				else
				{
					try
					{
						value = Integer.parseInt(baseBoard.getValueAt(i, j));
					}
					catch(NumberFormatException exception)
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
	}
	
	//</editor-fold>
	
	@Override
	public Integer getDefaultValue()
	{
		return DEFAULT_VALUE;
	}
}