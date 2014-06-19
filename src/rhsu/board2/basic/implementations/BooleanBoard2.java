package rhsu.board2.basic.implementations;

import rhsu.board2.basic.BoardImpl;

public class BooleanBoard2 extends BoardImpl<Boolean>
{
	static final Boolean DEFAULT_VALUE = false;
	
	public BooleanBoard2(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public BooleanBoard2(int horizontalSize, int verticalSize, Boolean defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
}
