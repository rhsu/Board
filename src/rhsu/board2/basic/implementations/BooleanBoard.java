package rhsu.board2.basic.implementations;

import rhsu.board2.basic.Board2Impl;

public class BooleanBoard extends Board2Impl<Boolean>
{
	private static final Boolean DEFAULT_VALUE = false;
	
	public BooleanBoard(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
