package rhsu.board2.basic.implementations.arithmetic;

import rhsu.board2.basic.BoardImpl;

public class DoubleBoard2 extends BoardImpl<Double>
{
	private static final double DEFAULT_VALUE = 0.0;
	
	public DoubleBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
