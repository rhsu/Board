package rhsu.board2;

import java.io.BufferedReader;
import rhsu.board2.boardModules.BoardModule;

public abstract class AbstractBoardModule<T> implements BoardModule<T>
{
	protected Board2<T> parent;
	
	public AbstractBoardModule() { }
	
	public AbstractBoardModule(String s1, String s2) { }
	
	public AbstractBoardModule(BufferedReader br, String s2) { }
	
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
