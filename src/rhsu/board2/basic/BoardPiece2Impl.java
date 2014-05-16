package rhsu.board2.basic;

import java.util.UUID;
import rhsu.board2.BoardPiece2;
import rhsu.board2.MobilityStatus2;

public class BoardPiece2Impl<T> implements BoardPiece2<T>
{
	protected int horizontalIndex;
	protected int verticalIndex;
	protected T value;
	protected MobilityStatus2 mobilityStatus;
	
	//TODO: This will be done once Mobility is implemented.
	//protected UUID uuid;
	
	public BoardPiece2Impl(int horizontalIndex, int verticalIndex, T value)
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
	
}
