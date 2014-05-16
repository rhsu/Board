package rhsu.board2.basic.implementations.arithmetic;

import rhsu.board2.basic.BoardImpl;

public class IntegerBoard2 extends BoardImpl<Integer>
{	
	private static final Integer DEFAULT_VALUE = 0;
	
	public IntegerBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
