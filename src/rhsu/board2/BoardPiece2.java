package rhsu.board2;

import java.util.UUID;

public interface BoardPiece2<T>
{
	public void setValue(T value);
	public T getValue();
	public int getHorizontalIndex();
	public int getVerticalIndex();
	public void setHorizontalIndex(int horizontal);
	public void setVerticalIndex(int vertical);
	public MobilityStatus getMobilityStatus();
	public void setStatus(MobilityStatus status);
	public void setUUID(UUID uuid);
	public UUID getUUID();
}
