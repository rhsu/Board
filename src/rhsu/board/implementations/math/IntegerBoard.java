package rhsu.board.implementations.math;

import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.AbstractMatrix;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.exceptionHandler.HandleType;
import rhsu.board.utilities.UtilityFunctions;

/**
 * An integer implementation
 */
public class IntegerBoard extends AbstractMatrix<Integer>
{
	/**
	 * Constructor to create a IntegerBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	@SuppressWarnings({"unchecked"})
	public IntegerBoard(int h, int v, Integer defaultValue)
	{
		super(h, v, defaultValue);
	}
	
	public IntegerBoard(int h, int v)
	{
		this(h, v, 0);
	}
	
	/**
	 * Constructor to create a IntegerBoard based off of a file 
	 * @param filename the name of the file to create a IntegerBoard from
	 */
	@SuppressWarnings({"unchecked"})
	public IntegerBoard(String filename)
	{		
		this(filename, HandleType.RuntimeError, null);
	}
	
	public IntegerBoard(String filename, Integer defaultValue)
	{
		this(filename, HandleType.Ignore, defaultValue);
	}
		
	@SuppressWarnings({"unchecked"})
	public IntegerBoard(String filename, HandleType handleType, Integer defaultValue)
	{
		super(filename);

		Integer value = null;
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{				
				if(baseBoard.pieceAt(i,j).getValue().equalsIgnoreCase("true"))
				{
					value = 1;
				}
				else if(baseBoard.pieceAt(i, j).getValue().equalsIgnoreCase("false"))
				{
					value = 0;
				}
				else
				{
					try
					{
						value = Integer.parseInt(baseBoard.getValueAt(i, j));
					}
					catch(Exception exception)
					{
						value = handler.AssignDefault(exception, handleType, defaultValue);
					}
					finally
					{
						board[i][j] = new BoardPiece(i, j, value);
					}
				}
			}
		}
	}
	
	@Override
	public IntegerBoard add(Matrix<Integer> m) 
	{	
		CheckDimensions(AbstractMatrix.OperationType.ADD, m);
				
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
		CheckDimensions(AbstractMatrix.OperationType.SUBTRACT, m);
		
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
		CheckDimensions(AbstractMatrix.OperationType.MULTIPLY, m);
		
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
		CheckDimensions(AbstractMatrix.OperationType.INVERSE);
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public Integer determinant() 
	{	
		CheckDimensions(AbstractMatrix.OperationType.DETERMINANT);

		if(this.horizontal_size == 1) return this.getValueAt(0, 0);
		
		if(this.horizontal_size == 2)
		{
			return (this.getValueAt(0, 0) * this.getValueAt(1, 1)) - ( this.getValueAt(0, 1) * this.getValueAt(1, 0));
		}
		
		Integer sum = 0;
		
		for (int i = 0; i < this.horizontal_size; i++) 
		{
			//sum += 
			//		changeSign(i) * this.getValueAt(0, i) * determinant(createSubMatrix(this, 0, i));
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
				
				result.setValueAt(r, c, this.getValueAt(i,j));
			}
		}
		
		return result;
	}
	
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
								* determinant(createSubMatrix(i,j)));
			}
		}
		
		return result;
	}
}