package rhsu.board.implementations.math;

import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.AbstractMatrix;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.exceptionHandler.HandleType;

/**
 *A double implementation
 */
public class DoubleBoard extends AbstractMatrix<Double>
{
	@SuppressWarnings({"unchecked"})
	public DoubleBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, 0.0);
			}
		}
	}

	public DoubleBoard(String filename)
	{
		this(filename, HandleType.RuntimeError, null);
	}
	
	public DoubleBoard(String filename, Double defaultValue)
	{
		this(filename, HandleType.Ignore, defaultValue);
	}
	
	@SuppressWarnings({"unchecked"})
	private DoubleBoard(String filename, HandleType handleType, Double defaultValue)
	{
		super(filename);
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					board[i][j] = new BoardPiece(i, j,
						Double.parseDouble(baseBoard.getValueAt(i, j)));
				}
				catch(Exception exception)
				{
					ExceptionHandler<Double> handler = new ExceptionHandler<>();
					
					board[i][j] = new BoardPiece(i, j,
							handler.AssignDefault(exception, handleType, defaultValue));
				}
			}
		}
	}
	
	@Override
	public DoubleBoard Add(Matrix<Double> m) 
	{
		CheckDimensions(AbstractMatrix.OperationType.ADD, m);
				
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
	public DoubleBoard Subtract(Matrix<Double> m) 
	{
		CheckDimensions(AbstractMatrix.OperationType.SUBTRACT, m);
				
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
	public DoubleBoard Multiply(Matrix<Double> m) 
	{
		CheckDimensions(AbstractMatrix.OperationType.MULTIPLY, m);
		
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
	public DoubleBoard Multiply(Double scalar) 
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
	public DoubleBoard Inverse() 
	{	
		CheckDimensions(AbstractMatrix.OperationType.INVERSE);
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Double Determinant() 
	{
		CheckDimensions(AbstractMatrix.OperationType.DETERMINANT);
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	@Override
	public DoubleBoard Transpose()
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
}
