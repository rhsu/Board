package rhsu.board2.basic.implementations;

import rhsu.board2.basic.BoardImpl;

public class StringBoard2 extends BoardImpl<String>
{
	private static final String DEFAULT_VALUE = "++";
	
	public StringBoard2(int horizontalSize, int verticalSize, String defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public StringBoard2(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
