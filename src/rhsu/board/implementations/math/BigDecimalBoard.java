package rhsu.board.implementations.math;

import rhsu.board.AbstractBoard;
import java.math.BigDecimal;
import rhsu.board.Board;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.arithmetic.MatrixPiece;
import rhsu.board.implementations.StringBoard;

/**
 *A big decimal implementation
 */
public final class BigDecimalBoard extends AbstractBoard<BigDecimalPiece> implements Matrix<BigDecimalPiece>
{
	public BigDecimalBoard(int h, int v)
	{
		super(h, v);
		board = new BigDecimalPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BigDecimalPiece(i, j, BigDecimal.ZERO);
			}
		}
	}

	public BigDecimalBoard(StringBoard copy)
	{
		super(copy);
		this.ConvertFromStringBoard(copy);
	}
	
	@Override
	public Matrix Add(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public Matrix Subtract(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Multiply(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Inverse() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BigDecimalPiece Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Multiply(MatrixPiece piece) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void ConvertFromStringBoard(StringBoard baseBoard) 
	{
		Board<BigDecimalPiece> result = new BigDecimalBoard(baseBoard.getHorizontal_size(), baseBoard.getVertical_size());
		
		try
		{
			for(int h = 0; h < baseBoard.getHorizontal_size(); h++)
			{
				for(int v = 0; v < baseBoard.getVertical_size(); v++)
				{
					//int i = Integer.parseInt(baseBoard.pieceAt(h,v).getType());
					result.pieceAt(h, v).setType(
							new BigDecimal(baseBoard.pieceAt(h,v).getType()));
				}
			}
			//return result;
		}
		catch(NumberFormatException e)
		{
			//return null;
		}
	}
}
