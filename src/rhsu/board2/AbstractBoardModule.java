package rhsu.board2;

import rhsu.board2.boardModules.BoardModule;

public abstract class AbstractBoardModule<T> implements BoardModule<T>
{
	protected Board2<T> parent;
	
	@Override
	public void setParent(Board2<T> parent)
	{
		this.parent = parent;
	}
	
	@Override
	public Board2<T> getParent()
	{
		return parent;
	}
}
