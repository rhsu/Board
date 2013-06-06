package rhsu.board.arithmetic;

import rhsu.board.Board;

/**
 *
 * @author rhsu
 */
public interface Matrix<T> extends Board<T>
{
	public Matrix Add(Matrix m);
	public Matrix Subtract(Matrix m);
	public Matrix Multiply(Matrix m);
	public Matrix Inverse();
	public T Determinant();
}
