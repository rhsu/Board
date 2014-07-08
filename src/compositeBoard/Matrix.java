package compositeBoard;

/**
 * A extension of the Board Interface to allow mathematical/matrix operations. This extension allows a board to be viewed as a 2 dimensional Matrix
 * @param <T> The type of the matrix object
 * @author rhsu
 */
public interface Matrix<T>
{
	/**
	 * Performs the add operation
	 * @param matrix
	 * @return the result after the add operation
	 */
	public rhsu.board.Matrix<T> add(Matrix<T> matrix);
	
	/**
	 * Performs the subtract operation
	 * @param matrix
	 * @return the result after the subtract operation
	 */
	public rhsu.board.Matrix<T> subtract(Matrix<T> matrix);
	
	/**
	 * Performs the multiply operation
	 * @param matrix
	 * @return the result after the multiply operation
	 */
	public rhsu.board.Matrix<T> multiply(Matrix<T> matrix);
	
	/**
	 * Performs the multiply scalar operation
	 * @param piece the scalar to multiply to the matrix
	 * @return the result after the multiply scalar operation
	 */
	public rhsu.board.Matrix<T> multiply(T piece);
	
	/**
	 * Performs the inverse operation
	 * @return the result after the inverse operation
	 */
	public rhsu.board.Matrix<T> inverse();
	
	/**
	 * Performs the determinant operation
	 * @return the result after the determinant operation
	 */
	public T determinant();
	
	public rhsu.board.Matrix<T> transpose();
	
	public rhsu.board.Matrix<T> createSubMatrix(int excluding_row, int excluding_column);
	
	public rhsu.board.Matrix<T> cofactor();
}
