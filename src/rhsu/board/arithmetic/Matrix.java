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
	public Matrix Add(Matrix m);
	
	/**
	 * Performs the subtract operation
	 * @param m the other matrix
	 * @return the result after the subtract operation
	 */
	public Matrix Subtract(Matrix m);
	
	/**
	 * Performs the multiply operation
	 * @param m the other matrix
	 * @return the result after the multiply operation
	 */
	public Matrix Multiply(Matrix m);
	
	/**
	 * Performs the multiply scalar operation
	 * @param piece the scalar to multiply to the matrix
	 * @return the result after the multiply scalar operation
	 */
	public Matrix Multiply(MatrixPiece piece);
	
	/**
	 * Performs the inverse operation
	 * @return the result after the inverse operation
	 */
	public Matrix Inverse();
	
	/**
	 * Performs the determinant operation
	 * @return the result after the determinant operation
	 */
	public T Determinant();
}
