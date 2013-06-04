package rhsu.board.sampleImplementations.math;

import rhsu.board.AbstractBoard;
import rhsu.board.arithmetic.Matrix;

/**
 * An integer implementation
 */
public class IntBoard extends AbstractBoard<IntPiece> implements Matrix<Integer>
{
	public IntBoard(int h, int v)
	{
		super(h, v);
		board = new IntPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new IntPiece(i, j, 0);
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
	public Integer Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}
}