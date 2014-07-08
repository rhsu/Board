package rhsu.board2;

/**
 * A extension of the Board Interface to allow mathematical/matrix operations. This extension allows a board to be viewed as a 2 dimensional Matrix
 * @param <T> The type of the matrix object
 * @author rhsu
 */
public interface Matrix2<T> extends Board2<T>
{	
	/**
	 * Performs the add operation
	 * @param matrix
	 * @return the result after the add operation
	 */
	public Matrix2<T> add(Matrix2<T> matrix);
	
	/**
	 * Performs the subtract operation
	 * @param matrix
	 * @return the result after the subtract operation
	 */
	public Matrix2<T> subtract(Matrix2<T> matrix);
	
	/**
	 * Performs the multiply operation
	 * @param matrix
	 * @return the result after the multiply operation
	 */
	public Matrix2<T> multiply(Matrix2<T> matrix);
	
	/**
	 * Performs the multiply scalar operation
	 * @param piece the scalar to multiply to the matrix
	 * @return the result after the multiply scalar operation
	 */
	public Matrix2<T> multiply(T piece);
	
	/**
	 * Performs the inverse operation
	 * @return the result after the inverse operation
	 */
	public Matrix2<T> inverse();
	
	/**
	 * Performs the determinant operation
	 * @return the result after the determinant operation
	 */
	public T determinant();
	
	public Matrix2<T> transpose();
	
	public Matrix2<T> createSubMatrix(int excluding_row, int excluding_column);
	
	public Matrix2<T> cofactor();
}
