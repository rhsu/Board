package rhsu.compositeBoard.implementations;

import rhsu.board2.BoardImpl;

public class IntegerBoard2Composite extends BoardImpl<Integer>
{	
	static final Integer DEFAULT_VALUE = 0;
	
	public IntegerBoard2Composite(int horizontalSize, int verticalSize, Integer defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public IntegerBoard2Composite(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
