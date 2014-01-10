package rhsu.board.basic;

import java.util.Objects;
import rhsu.board.BoardPiece;
import rhsu.board.RandomGenerator;

/**
 * A wrapper class for objects. Contains two additional int properties (horizontal index and vertical index)
 * @param <T> The type of the BoardPiece to wrap
 */
public class BasicBoardPiece<T> implements BoardPiece<T>
{
	protected int horizontal;
	protected int vertical;
	protected T value;

	//<editor-fold defaultstate="collapsed" desc="ACCESSORS">
	/**
	* @return the horizontal index
	*/
	@Override
	public int getHorizontal()
	{
		return this.horizontal;
	}

	/**
	 * 
	 * @return the vertical index
	 */
	@Override
	public int getVertical()
	{
		return this.vertical;
	}

	/**
	 * 
	 * @return the object itself
	 */
	@Override
	public T getValue()
	{
		return value;
	}

	/**
	 * Modifies the object to be the same as the parameter
	 * @param t the value to change into
	 */
	@Override
	public void setValue(T value)
	{
		this.value = value;
	}
	//</editor-fold>
	
	/**
	 * General constructor for a board piece
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @param t The value of the board piece.
	 */
	public BasicBoardPiece(int horizontal, int vertical, T value)
	{
		this.horizontal = horizontal;
		this.vertical = vertical;
		this.value = value;
	}

	public BasicBoardPiece(int horizontal, int vertical, RandomGenerator<T> randomGenerator)
	{
		this.horizontal = horizontal;
		this.vertical = vertical;
		this.value = randomGenerator.getRandom();
	}
	
	/**
	 * 
	 * @return a string representation of a board piece
	 */		
	@Override
	public String toString()
	{
		return value.toString();
	}
	
	@Override
	public final boolean equals(Object other)
	{
		if(!(other instanceof BasicBoardPiece<?>)) return false;
		
		return this.hashCode() == other.hashCode();
	}

	@Override
	public int hashCode() 
	{
		int hash = 3;
		hash = 59 * hash + this.horizontal;
		hash = 59 * hash + this.vertical;
		hash = 59 * hash + Objects.hashCode(this.value);
		return hash;
	}
}