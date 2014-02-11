package rhsu.board;

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
}
