package rhsu.board2.basic.implementations;

import rhsu.board2.basic.BoardImpl;

public class BooleanBoard2 extends BoardImpl<Boolean>
{
	private static final Boolean DEFAULT_VALUE = false;
	
	public BooleanBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
