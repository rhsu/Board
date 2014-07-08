package rhsu.board2.boardCores;

import rhsu.board2.BoardImpl;

public class IntegerBoard2 extends BoardImpl<Integer>
{	
	static final Integer DEFAULT_VALUE = 0;
	
	public IntegerBoard2(int horizontalSize, int verticalSize, Integer defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public IntegerBoard2(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
