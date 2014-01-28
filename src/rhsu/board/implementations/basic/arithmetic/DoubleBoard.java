package rhsu.board.implementations.basic.arithmetic;

import java.io.BufferedReader;
import java.util.Random;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board.RandomGenerator;
import rhsu.board.basic.AbstractBasicMatrix;
import rhsu.board.Matrix;
import rhsu.board.exceptionHandler.HandleType;
import rhsu.board.utilities.UtilityFunctions;

/**
 *A double implementation
 */
public class DoubleBoard extends AbstractBasicMatrix<Double>
{
	private static final Double DEFAULT_VALUE = 0.0;
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
	/**
	 * Constructor to create a DoubleBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	@SuppressWarnings({"unchecked"})
	public DoubleBoard(int h, int v, Double defaultValue)
	{
		super(h, v, defaultValue);
	}

	public DoubleBoard(int h, int v)
	{
		this(h, v, DEFAULT_VALUE);
	}

	public DoubleBoard(String filename)
	{
		this(filename, HandleType.RuntimeError, DEFAULT_VALUE);
	}
	
	public DoubleBoard(String filename, Double defaultValue)
	{
		this(filename, HandleType.Ignore, defaultValue);
	}
	
	@SuppressWarnings({"unchecked"})
	public DoubleBoard(String filename, HandleType handleType, Double defaultValue)
	{
		super(filename);
		this.doPopulateFromFile(filename);
	}
	
	public DoubleBoard(BufferedReader bufferedReader)
	{
		this(bufferedReader, HandleType.RuntimeError, null);
	}
	
	public DoubleBoard(BufferedReader bufferedReader, Double defaultValue)
	{
		this(bufferedReader, HandleType.Ignore, defaultValue);
	}
	
	@SuppressWarnings({"unchecked"})
	public DoubleBoard(BufferedReader bufferedReader, HandleType handleType, Double defaultValue)
	{
		super(bufferedReader);
		this.doPopulateFromResource(bufferedReader);
	}
	//</editor-fold>
		
	@Override
	public DoubleBoard add(Matrix<Double> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.ADD, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		DoubleBoard result =  new DoubleBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				Double a = this.getValueAt(i, j);
				Double b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a+b);
			}
		}
		
		return result;
	}

	@Override
	public DoubleBoard subtract(Matrix<Double> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SUBTRACT, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		DoubleBoard result =  new DoubleBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				Double a = this.getValueAt(i, j);
				Double b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a-b);
			}
		}
		
		return result;
	}

	@Override
	public DoubleBoard multiply(Matrix<Double> m) 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.MULTIPLY, m);
		
		int h = this.getHorizontal_size();
		int v = m.getVertical_size();
		
		DoubleBoard result = new DoubleBoard(h, v);
		
		for(int i = 0 ; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				double sum = 0.0;
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
	public DoubleBoard multiply(Double scalar) 
	{
		DoubleBoard result = new DoubleBoard(this.horizontal_size, 
				this.vertical_size);
		
		for(int h = 0; h < this.horizontal_size; h++)
		{
			for(int v = 0; v < this.vertical_size; v++)
			{
				double m = this.getValueAt(h, v);
				result.setValueAt(h, v, m*scalar);
			}
		}
		
		return result;
	}
	
	@Override
	public DoubleBoard inverse() 
	{	
		CheckDimensions(AbstractBasicMatrix.OperationType.SQUAREMATRIX);

		DoubleBoard inverseMatrix = this.cofactor().transpose();
		
		return inverseMatrix.multiply(1/this.determinant());
	}

	@Override
	public Double determinant() 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SQUAREMATRIX);

		if(this.horizontal_size == 1) return this.getValueAt(0, 0);
		
		if(this.horizontal_size == 2)
		{
			return (this.getValueAt(0, 0) * this.getValueAt(1, 1)) - ( this.getValueAt(0, 1) * this.getValueAt(1, 0));
		}
		
		Double sum = 0.0;
		
		for (int i = 0; i < this.horizontal_size; i++) 
		{
			sum += UtilityFunctions.changeSign(i) 
					* this.getValueAt(0, i) 
					* createSubMatrix(0, i).determinant();
		}
		
		return sum;
	}
	
	@Override
	public DoubleBoard transpose()
	{
		int h = this.horizontal_size;
		int v = this.vertical_size;
		DoubleBoard result = new DoubleBoard(v, h);
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
	public DoubleBoard createSubMatrix(int excluding_row, int excluding_column) 
	{
		DoubleBoard result = new DoubleBoard(this.horizontal_size-1,
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
	public DoubleBoard cofactor() 
	{
		DoubleBoard result = new DoubleBoard(this.horizontal_size, 
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
	public RandomGenerator<Double> randomGenerator() 
	{
		RandomGenerator<Double> generator = new RandomGenerator()
		{
			Random random = new Random();
			
			@Override
			public Double getRandom() 
			{
				return random.nextDouble();
			}	
		};
		
		return generator;
	}
	
	//<editor-fold desc="BoardIO Methods" defaultstate="collapsed">

	@Override
	public void initializeFromBaseBoard()
	{		
		Double value = null;
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					value = Double.parseDouble(baseBoard.getValueAt(i, j));
				}
				catch(Exception exception)
				{
					value = handler.AssignDefault(exception, handleType, defaultValue);
				}
				finally
				{
					board[i][j] = new BasicBoardPiece(i, j, value);
				}
			}
		}
	}
	
	private void doPopulateFromFile(String filename)
	{
		this.populateFromFile(filename);
	}
	
	private void doPopulateFromResource(BufferedReader resource)
	{
		this.populateFromResource(resource);
	}
	
	//</editor-fold>
}
