package rhsu.board2.basic;

import rhsu.board2.Board2;

public class Board2Impl implements Board2
{	
	protected int horizontalSize;
	protected int verticalSize;
	protected int size;
	protected Object defaultValue;
	
	@Override
	public int getHorizontalSize()
	{
		return horizontalSize;
	}

	@Override
	public int getVerticalSize()
	{
		return verticalSize;
	}

	@Override
	public int getSize()
	{
		return size;
	}

	@Override
	public Object getDefaultValue()
	{
		return null;
	}
	
	public Board2Impl(int horizontalSize, int verticalSize)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.size = horizontalSize * verticalSize;
		this.defaultValue = null;
	}
}
