package rhsu.board2;

public interface BoardModule<T>
{
	public CompositeBoard<T> getParent();
	public void setParent(CompositeBoard<T> parent);
}
