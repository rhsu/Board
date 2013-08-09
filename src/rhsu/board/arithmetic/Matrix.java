package rhsu.board.arithmetic;

import rhsu.board.Board;

/**
 *
 * @author rhsu
 */
public interface Matrix<T> extends Board<T>
{	
	public Matrix Add(Matrix<T> m);
	public Matrix Subtract(Matrix<T> m);
	public Matrix Multiply(Matrix<T> m);
	public Matrix Multiply(T t);
	public Matrix Inverse();
	public T Determinant();
}
