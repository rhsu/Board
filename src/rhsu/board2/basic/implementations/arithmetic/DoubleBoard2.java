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
	
	
	@Override
	public boolean equals(Object aInstance)
	{
		if (this == aInstance) return true;
		if ( !(aInstance instanceof BoardImpl ) ) return false; 
		
		BoardImpl instance = (BoardImpl) aInstance;
		
		return
			instance.getHorizontalSize() == this.getHorizontalSize() &&
			instance.getVerticalSize() == this.getVerticalSize() &&
			instance.toString().equals(this.toString());
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
