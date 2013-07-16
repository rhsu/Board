package rhsu.board;

public class AbstractPiece<T>
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

	public AbstractPiece(int i, int j, T t)
	{
		this.horizontal = i;
		this.vertical = j;
		this.t = t;
	}

	@Override
	public String toString()
	{
		return t.toString();
	}
}