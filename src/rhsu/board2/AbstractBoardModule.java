package rhsu.board2;

public abstract class AbstractBoardModule<T> implements BoardModule<T>
{
	protected CompositeBoard<T> parent;
	
	@Override
	public void setParent(CompositeBoard<T> parent)
	{
		this.parent = parent;
	}
	
	@Override
	public CompositeBoard<T> getParent()
	{
		return parent;
	}
}
