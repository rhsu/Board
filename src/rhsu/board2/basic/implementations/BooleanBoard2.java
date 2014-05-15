package rhsu.board2.basic.implementations;

import rhsu.board2.basic.Board2Impl;

public class BooleanBoard2 extends Board2Impl<Boolean>
{
	private static final Boolean DEFAULT_VALUE = false;
	
	public BooleanBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
