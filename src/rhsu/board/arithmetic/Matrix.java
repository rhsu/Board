package rhsu.board.arithmetic;

import rhsu.board.Board;

/**
 * A extension of the Board Interface to allow mathematical/matrix operations. This extension allows a board to be viewed as a 2 dimensional Matrix
 * @param <T> The type of the matrix object
 * @author rhsu
 */
public interface Matrix<T> extends Board<T>
{	
	/**
	 * Performs the add operation
	 * @param m the other matrix
	 * @return the result after the add operation
	 */
	public Matrix<T> Add(Matrix<T> m);
	
	/**
	 * Performs the subtract operation
	 * @param m the other matrix
	 * @return the result after the subtract operation
	 */
	public Matrix<T> Subtract(Matrix<T> m);
	
	/**
	 * Performs the multiply operation
	 * @param m the other matrix
	 * @return the result after the multiply operation
	 */
	public Matrix<T> Multiply(Matrix<T> m);
	
	/**
	 * Performs the multiply scalar operation
	 * @param piece the scalar to multiply to the matrix
	 * @return the result after the multiply scalar operation
	 */
	public Matrix<T> Multiply(T piece);
	
	/**
	 * Performs the inverse operation
	 * @return the result after the inverse operation
	 */
	public Matrix<T> Inverse();
	
	/**
	 * Performs the determinant operation
	 * @return the result after the determinant operation
	 */
	public T Determinant();
	
	public Matrix<T> Transpose();
}
