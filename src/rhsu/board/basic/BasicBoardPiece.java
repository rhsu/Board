package rhsu.board.basic;

import java.util.Objects;
import java.util.UUID;
import rhsu.board.BoardPiece;
import rhsu.board2.MobilityStatus;
import rhsu.board2.random.RandomGenerator;

/**
 * A wrapper class for objects. Contains two additional integer properties (horizontal index and vertical index)
 * @param <T> The type of the BoardPiece to wrap
 */
public class BasicBoardPiece<T> implements BoardPiece<T>
{
	protected int horizontal;
	protected int vertical;
	protected T value;
	protected MobilityStatus mobilityStatus;
	protected UUID uuid;
	
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
	 * @param value
	 */
	@Override
	public void setValue(T value)
	{
		this.value = value;
	}
	
	@Override
	public void setHorizontal(int horizontal)
	{
		this.horizontal = horizontal;
	}
	
	@Override
	public void setVertical(int vertical)
	{
		this.vertical = vertical;
	}
	
	@Override
	public UUID getUUID()
	{
		return this.uuid;
	}
	
	@Override
	public void setUUID(UUID uuid)
	{
		this.uuid = uuid;
	}
	
	//</editor-fold>
	
	public BasicBoardPiece(int horizontal, int vertical, T value, UUID uuid)
	{
		this(horizontal, vertical, value);
		this.uuid = uuid;
	}
	
	public BasicBoardPiece(int horizontal, int vertical, RandomGenerator<T> randomGenerator, UUID uuid)
	{
		this(horizontal, vertical, randomGenerator);
		this.uuid = uuid;
	}
	
	/**
	 * General constructor for a board piece
	 * @param horizontal
	 * @param vertical
	 * @param value
	 */
	public BasicBoardPiece(int horizontal, int vertical, T value)
	{
		this.horizontal = horizontal;
		this.vertical = vertical;
		this.value = value;
		this.mobilityStatus = MobilityStatus.Free;
	}

	public BasicBoardPiece(int horizontal, int vertical, RandomGenerator<T> randomGenerator)
	{
		this.horizontal = horizontal;
		this.vertical = vertical;
		this.value = randomGenerator.getRandom();
		this.mobilityStatus = MobilityStatus.Free;
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

	@Override
	public MobilityStatus getMobilityStatus() 
	{
		return this.mobilityStatus;
	}

	@Override
	public void setStatus(MobilityStatus status) 
	{
		this.mobilityStatus = status;
	}
}