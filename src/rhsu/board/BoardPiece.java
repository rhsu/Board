package rhsu.board;

import rhsu.board2.mobility.MobilityStatus;
import java.util.UUID;

public interface BoardPiece<T>
{
	public void setValue(T t);
	public T getValue();
	public int getHorizontal();
	public int getVertical();
	public void setHorizontal(int horizontal);
	public void setVertical(int vertical);
	public MobilityStatus getMobilityStatus();
	public void setStatus(MobilityStatus status);
	public void setUUID(UUID uuid);
	public UUID getUUID();
}
