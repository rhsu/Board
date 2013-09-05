package rhsu.board.implementations.math;

import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.AbstractMatrix;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.exceptionHandler.HandleType;

/**
 * An integer implementation
 */
public class IntegerBoard extends AbstractMatrix<Integer>
{
	@SuppressWarnings({"unchecked"})
	public IntegerBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, 0);
			}
		}
	}
	
	public IntegerBoard(String filename)
	{		
		this(filename, HandleType.RuntimeError, null);
	}
	
	public IntegerBoard(String filename, Integer defaultValue)
	{
		this(filename, HandleType.Ignore, defaultValue);
	}
		
	@SuppressWarnings({"unchecked"})
	private IntegerBoard(String filename, HandleType handleType, Integer defaultValue)
	{
		super(filename);

		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				if(baseBoard.pieceAt(i,j).getType().equalsIgnoreCase("true"))
				{
					board[i][j] = new BoardPiece(i, j, 1);
				}
				else if(baseBoard.pieceAt(i, j).getType().equalsIgnoreCase("false"))
				{
					board[i][j] = new BoardPiece(i, j, 0);
				}
				else
				{
					try
					{
						board[i][j] = new BoardPiece(i, j, 
							Integer.parseInt(baseBoard.getValueAt(i, j)));
					}
					catch(Exception exception)
					{
						ExceptionHandler<Integer> handler = new ExceptionHandler<>();
						
						board[i][j] = new BoardPiece(i, j,
							handler.AssignDefault(exception, handleType, defaultValue));
					}
				}
			}
		}
	}
	
	@Override
	public IntegerBoard Add(Matrix<Integer> m) 
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
	public IntegerBoard Subtract(Matrix<Integer> m) 
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
	public IntegerBoard Multiply(Matrix<Integer> m) 
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
	public IntegerBoard Multiply(Integer scalar) 
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
	public IntegerBoard Inverse() 
	{
		CheckDimensions(AbstractMatrix.OperationType.INVERSE);
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public Integer Determinant() 
	{	
		CheckDimensions(AbstractMatrix.OperationType.DETERMINANT);
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	@Override
	public IntegerBoard Transpose()
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
}