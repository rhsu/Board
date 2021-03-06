package rhsu.board2;

import rhsu.board2.boardModules.mobility.MobilityStatus;
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
	public void setMobilityStatus(MobilityStatus status);
	public void setUUID(UUID uuid);
	public UUID getUUID();
}
