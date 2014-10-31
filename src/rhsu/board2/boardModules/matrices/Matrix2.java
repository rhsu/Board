package rhsu.board2.boardModules.matrices;

import rhsu.board2.boardModules.BoardModule;
import rhsu.board2.Board2;

public interface Matrix2<T> extends BoardModule<T>
{	
	/**
	 * Performs the add operation
	 * @param matrix
	 * @return the result after the add operation
	 */
	public Board2<T> add(Board2<T> matrix);
	
	/**
	 * Performs the subtract operation
	 * @param matrix
	 * @return the result after the subtract operation
	 */
	public Board2<T> subtract(Board2<T> matrix);
	
	/**
	 * Performs the multiply operation
	 * @param matrix
	 * @return the result after the multiply operation
	 */
	public Board2<T> multiply(Board2<T> matrix);
	
	/**
	 * Performs the multiply scalar operation
	 * @param piece the scalar to multiply to the matrix
	 * @return the result after the multiply scalar operation
	 */
	public Board2<T> multiply(T piece);
	
	/**
	 * Performs the inverse operation
	 * @return the result after the inverse operation
	 */
	public Board2<T> inverse();
	
	/**
	 * Performs the determinant operation
	 * @return the result after the determinant operation
	 */
	public T determinant();
	
	public Board2<T> transpose();
	
	public Board2<T> createSubMatrix(int excluding_row, int excluding_column);
	
	public Board2<T> cofactor();
}
