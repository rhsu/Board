package rhsu.board.implementations.math;

import rhsu.board.AbstractBoard;
import java.math.BigDecimal;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.arithmetic.MatrixPiece;

/**
 *A big decimal implementation
 */
public class BigDecimalBoard extends AbstractBoard<BigDecimalPiece> implements Matrix<BigDecimalPiece>
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
}
