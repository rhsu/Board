package rhsu.board.implementations.math;

import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.AbstractMatrix;
import rhsu.board.arithmetic.Matrix;

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

	@SuppressWarnings({"unchecked"})
	public DoubleBoard(String filename)
	{
		super(filename);
		
		this.horizontal_size = baseBoard.getHorizontal_size();
		this.vertical_size = baseBoard.getVertical_size();
		this.board = new BoardPiece[horizontal_size][vertical_size];		

		for(int i = 0; i < baseBoard.getHorizontal_size(); i++)
		{
			for(int j = 0; j < baseBoard.getVertical_size(); j++)
			{
				try
				{
				board[i][j] = new BoardPiece(i,j,
						Double.parseDouble(baseBoard.getTypeAt(i, j)));
				}
				catch(NumberFormatException e)
				{
					board[i][j] = new BoardPiece(i, j, 
							"ERROR");
				}
			}
		}
	}
	
	@Override
	public Matrix Add(Matrix<Double> m) 
	{
		CheckDimensions(m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		DoubleBoard result =  new DoubleBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				Double a = this.getTypeAt(i, j);
				Double b = m.getTypeAt(i, j);		
				result.setTypeAt(i, j, a+b);
			}
		}
		
		return result;
	}

	@Override
	public Matrix Subtract(Matrix<Double> m) 
	{
		CheckDimensions(m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		DoubleBoard result =  new DoubleBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				Double a = this.getTypeAt(i, j);
				Double b = m.getTypeAt(i, j);		
				result.setTypeAt(i, j, a-b);
			}
		}
		
		return result;
	}

	@Override
	public Matrix Multiply(Matrix m) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Multiply(Double scalar) 
	{
		DoubleBoard result = new DoubleBoard(this.horizontal_size, 
				this.vertical_size);
		
		for(int h = 0; h < this.horizontal_size; h++)
		{
			for(int v = 0; v < this.vertical_size; v++)
			{
				double m = this.getTypeAt(h, v);
				result.setTypeAt(h, v, m*scalar);
			}
		}
		
		return result;
	}
	
	@Override
	public Matrix Inverse() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Double Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
