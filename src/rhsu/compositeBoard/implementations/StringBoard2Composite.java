package rhsu.compositeBoard.implementations;

import rhsu.board2.BoardImpl;

public class StringBoard2Composite extends BoardImpl<String>
{
	static final String DEFAULT_VALUE = "++";
	
	public StringBoard2Composite(int horizontalSize, int verticalSize, String defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public StringBoard2Composite(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
