package rhsu.board2.basic.implementations.arithmetic;

import rhsu.board2.basic.Board2Impl;

public class IntegerBoard2 extends Board2Impl<Integer>
{	
	private static final Integer DEFAULT_VALUE = 0;
	
	public IntegerBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
	
	@Override
	public Integer getDefaultValue() { return DEFAULT_VALUE; }
}
