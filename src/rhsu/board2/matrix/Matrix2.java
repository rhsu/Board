package rhsu.board2.matrix;

import rhsu.compositeBoard.CompositeBoard;

public interface Matrix2<T>
{	
	/**
	 * Performs the add operation
	 * @param matrix
	 * @return the result after the add operation
	 */
	public CompositeBoard<T> add(CompositeBoard<T> matrix);
	
	/**
	 * Performs the subtract operation
	 * @param matrix
	 * @return the result after the subtract operation
	 */
	public CompositeBoard<T> subtract(CompositeBoard<T> matrix);
	
	/**
	 * Performs the multiply operation
	 * @param matrix
	 * @return the result after the multiply operation
	 */
	public CompositeBoard<T> multiply(CompositeBoard<T> matrix);
	
	/**
	 * Performs the multiply scalar operation
	 * @param piece the scalar to multiply to the matrix
	 * @return the result after the multiply scalar operation
	 */
	public CompositeBoard<T> multiply(T piece);
	
	/**
	 * Performs the inverse operation
	 * @return the result after the inverse operation
	 */
	public CompositeBoard<T> inverse();
	
	/**
	 * Performs the determinant operation
	 * @return the result after the determinant operation
	 */
	public T determinant();
	
	public CompositeBoard<T> transpose();
	
	public CompositeBoard<T> createSubMatrix(int excluding_row, int excluding_column);
	
	public CompositeBoard<T> cofactor();
}
