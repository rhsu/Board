package rhsu.board2.basic.implementations.arithmetic;

import rhsu.board2.basic.BoardImpl;

public class DoubleBoard2 extends BoardImpl<Double>
{
	private static final double DEFAULT_VALUE = 0.0;
	
	public DoubleBoard2(int horizontalSize, int verticalSize, Double defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public DoubleBoard2(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
