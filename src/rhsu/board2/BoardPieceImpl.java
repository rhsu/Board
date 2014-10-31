package rhsu.board2;

import rhsu.board2.boardModules.mobility.MobilityStatus;
import java.util.Objects;
import java.util.UUID;

public class BoardPieceImpl<T> implements BoardPiece2<T>
{
	protected int horizontalIndex;
	protected int verticalIndex;
	protected T value;
	protected MobilityStatus mobilityStatus;
	
	protected UUID uuid;
	
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
	public MobilityStatus getMobilityStatus() { return this.mobilityStatus; }

	@Override
	public void setMobilityStatus(MobilityStatus status) { this.mobilityStatus = status; }
	
	@Override
	public void setUUID(UUID uuid) { this.uuid = uuid; }

	@Override
	public UUID getUUID() { return this.uuid; }
	
	//<editor-fold desc="Constructor" defaultstate="collapsed">
	
	public BoardPieceImpl(int horizontalIndex, int verticalIndex, T value)
	{
		this.horizontalIndex = horizontalIndex;
		this.verticalIndex= verticalIndex;
		this.value = value;
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Inheirited from Object" defaultstate="collapsed">
	
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
	
	//</editor-fold>
}
