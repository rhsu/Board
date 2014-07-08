package rhsu.board2.boardCores;

import rhsu.board2.BoardImpl;

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
