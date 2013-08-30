package rhsu.board;

public class BoardPiece<T>
{
	private int horizontal;
	private int vertical;
	private T t;

	//<editor-fold defaultstate="collapsed" desc="ACCESSORS">
	/**
	* @return the horizontal index
	*/
	public int getHorizontal()
	{
		return this.horizontal;
	}

	/**
	 * 
	 * @return the vertical index
	 */
	public int getVertical()
	{
		return this.vertical;
	}

	/**
	 * 
	 * @return the object itself
	 */
	public T getType()
	{
		return t;
	}

	/**
	 * Modifies the object to be the same as the parameter
	 * @param t the value to change into
	 */
	public void setType(T t)
	{
		this.t = t;
	}
	//</editor-fold>

	/**
	 * General constructor for a board piece
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @param t The value of the board piece.
	 */
	public BoardPiece(int i, int j, T t)
	{
		this.horizontal = i;
		this.vertical = j;
		this.t = t;
	}

	/**
	 * 
	 * @return a string representation of a board piece
	 */
	@Override
	public String toString()
	{
		return t.toString();
	}
}