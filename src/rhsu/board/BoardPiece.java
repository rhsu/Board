package rhsu.board;

import java.util.Objects;

/**
 * A wrapper class for objects. Contains two additional int properties (horizontal index and vertical index)
 * @param <T> The type of the BoardPiece to wrap
 */
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
	public T getValue()
	{
		return t;
	}

	/**
	 * Modifies the object to be the same as the parameter
	 * @param t the value to change into
	 */
	public void setValue(T t)
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

	public BoardPiece(int i, int j, RandomGenerator<T> randomGenerator)
	{
		this.horizontal = i;
		this.vertical = j;
		this.t = randomGenerator.getRandom();
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
	
	@Override
	public final boolean equals(Object other)
	{
		if(!(other instanceof BoardPiece<?>)) return false;
		
		return this.hashCode() == other.hashCode();
	}

	@Override
	public int hashCode() 
	{
		int hash = 3;
		hash = 59 * hash + this.horizontal;
		hash = 59 * hash + this.vertical;
		hash = 59 * hash + Objects.hashCode(this.t);
		return hash;
	}
}