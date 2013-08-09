package rhsu.board.arithmetic;

import rhsu.board.AbstractBoard;

/**
 *
 * @author rhsu
 */
public class AbstractMatrix<T> extends AbstractBoard<T> implements Matrix<T>
{
	public AbstractMatrix(int h, int v)
	{
		super(h, v);
	}
	
	public AbstractMatrix(String filename)
	{
		super(filename);
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
	public Matrix Multiply(MatrixPiece piece) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Inverse() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public T Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
