package rhsu.board.implementations.math;

import rhsu.board.AbstractBoard;
import rhsu.board.arithmetic.Matrix;

/**
 *A double implementation
 */
public class DoubleBoard extends AbstractBoard<DoublePiece> implements Matrix<DoublePiece>
{
	public DoubleBoard(int h, int v)
	{
		super(h, v);
		board = new DoublePiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new DoublePiece(i, j, 0.0);
			}
		}
	}

	@Override
	public Matrix Add(Matrix m) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix Subtract(Matrix m) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix Multiply(Matrix m) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix Inverse() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public DoublePiece Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
