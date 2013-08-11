package rhsu.board.implementations.math;

import java.math.BigDecimal;
import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.AbstractMatrix;
import rhsu.board.arithmetic.Matrix;

/**
 *A big decimal implementation
 */
public class BigDecimalBoard extends AbstractMatrix<BigDecimal>
{
	@SuppressWarnings({"unchecked"})
	public BigDecimalBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, BigDecimal.ZERO);
			}
		}
	}
	
	@SuppressWarnings({"unchecked"})
	public BigDecimalBoard(String filename)
	{
		super(filename);
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					board[i][j] = new BoardPiece(i, j, 
							new BigDecimal(baseBoard.getTypeAt(i, j)));
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
	public Matrix Add(Matrix<BigDecimal> m) 
	{
		CheckDimensions(m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigDecimalBoard result =  new BigDecimalBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigDecimal a = this.getTypeAt(i, j);
				BigDecimal b = m.getTypeAt(i, j);		
				result.setTypeAt(i, j, a.add(b));
			}
		}
		
		return result;
	}

	@Override
	public Matrix Subtract(Matrix<BigDecimal> m) 
	{
		CheckDimensions(m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigDecimalBoard result =  new BigDecimalBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigDecimal a = this.getTypeAt(i, j);
				BigDecimal b = m.getTypeAt(i, j);		
				result.setTypeAt(i, j, a.subtract(b));
			}
		}
		
		return result;
	}

	@Override
	public Matrix Multiply(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Multiply(BigDecimal scalar) 
	{
		BigDecimalBoard result = new BigDecimalBoard(this.horizontal_size,
				this.vertical_size);
		
		for(int h = 0; h < this.horizontal_size; h++)
		{
			for(int v = 0; v < this.vertical_size; v++)
			{
				BigDecimal m = this.getTypeAt(h, v);
				this.setTypeAt(h, v, m.multiply(scalar));
			}
		}
		
		return result;
	}
	
	@Override
	public Matrix Inverse() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BigDecimal Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
