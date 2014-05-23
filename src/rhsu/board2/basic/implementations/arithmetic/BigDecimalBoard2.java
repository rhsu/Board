package rhsu.board2.basic.implementations.arithmetic;

import java.math.BigDecimal;
import rhsu.board2.basic.BoardImpl;

public class BigDecimalBoard2 extends BoardImpl<BigDecimal>
{
	private static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;
	
	public BigDecimalBoard2(int horizontalSize, int verticalSize, BigDecimal defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public BigDecimalBoard2(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
