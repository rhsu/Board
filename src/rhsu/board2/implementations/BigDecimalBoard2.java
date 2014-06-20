package rhsu.board2.implementations;

import java.math.BigDecimal;
import rhsu.board2.BoardImpl;

public class BigDecimalBoard2 extends BoardImpl<BigDecimal>
{
	static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;
	
	public BigDecimalBoard2(int horizontalSize, int verticalSize, BigDecimal defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public BigDecimalBoard2(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
