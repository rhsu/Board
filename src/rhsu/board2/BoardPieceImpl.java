package rhsu.board2;

import java.util.Objects;
import java.util.UUID;
import rhsu.board2.BoardPiece2;
import rhsu.board2.MobilityStatus2;

public class BoardPieceImpl<T> implements BoardPiece2<T>
{
	protected int horizontalIndex;
	protected int verticalIndex;
	protected T value;
	protected MobilityStatus2 mobilityStatus;
	
	//TODO: This will be done once Mobility is implemented.
	//protected UUID uuid;
	
	public BoardPieceImpl(int horizontalIndex, int verticalIndex, T value)
	{
		this.horizontalIndex = horizontalIndex;
		this.verticalIndex= verticalIndex;
		this.value = value;
	}
	
	@Override
	public void setValue(T value) { this.value = value; }

	@Override
	public T getValue() { return this.value; }

	@Override
	public int getHorizontalIndex() { return this.horizontalIndex; }

	@Override
	public int getVerticalIndex() {return this.verticalIndex;}

	@Override
	public void setHorizontalIndex(int horizontalIndex) { this.horizontalIndex = horizontalIndex; }

	@Override
	public void setVerticalIndex(int verticalIndex) { this.verticalIndex = verticalIndex; }

	@Override
	public MobilityStatus2 getMobilityStatus()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setStatus(MobilityStatus2 status)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setUUID(UUID uuid)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public UUID getUUID()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public boolean equals(Object aInstance)
	{
		if (this == aInstance) return true;
		if ( !(aInstance instanceof BoardPieceImpl ) ) return false; 
		
		BoardPieceImpl instance = (BoardPieceImpl) aInstance;
		
		return 
			instance.getHorizontalIndex() == this.getHorizontalIndex() &&
			instance.getVerticalIndex() == this.getVerticalIndex() &&
			instance.getValue() == this.value;
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 43 * hash + this.horizontalIndex;
		hash = 43 * hash + this.verticalIndex;
		hash = 43 * hash + Objects.hashCode(this.value);
		//hash = 43 * hash + Objects.hashCode(this.mobilityStatus);
		return hash;
	}
	
	@Override
	public String toString()
	{
		return this.value.toString();
	}
	
}
