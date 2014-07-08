package rhsu.compositeBoard.implementations;

import rhsu.board2.BoardImpl;

public class BooleanBoard2Composite extends BoardImpl<Boolean>
{
	static final Boolean DEFAULT_VALUE = false;
	
	public BooleanBoard2Composite(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public BooleanBoard2Composite(int horizontalSize, int verticalSize, Boolean defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
}
