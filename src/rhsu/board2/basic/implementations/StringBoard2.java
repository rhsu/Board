package rhsu.board2.basic.implementations;

import rhsu.board2.basic.Board2Impl;

public class StringBoard2 extends Board2Impl<String>
{
	private static final String DEFAULT_VALUE = "++";
	
	public StringBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
