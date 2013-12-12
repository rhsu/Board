package rhsu.board;

public interface BoardPiece<T>
{
	public void setValue(T t);
	public T getValue();
	public int getHorizontal();
	public int getVertical();
}
