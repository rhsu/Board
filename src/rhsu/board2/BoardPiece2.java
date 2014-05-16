package rhsu.board2;

import java.util.UUID;

public interface BoardPiece2<T>
{
	public void setValue(T t);
	public T getValue();
	public int getHorizontalIndex();
	public int getVerticalIndex();
	public void setHorizontalIndex(int horizontal);
	public void setVerticalIndex(int vertical);
	public MobilityStatus2 getMobilityStatus();
	public void setStatus(MobilityStatus2 status);
	public void setUUID(UUID uuid);
	public UUID getUUID();
}
