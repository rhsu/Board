package rhsu.board2.basic.implementations.arithmetic;

import java.math.BigDecimal;
import rhsu.board2.basic.Board2Impl;

public class BigDecimalBoard2 extends Board2Impl<BigDecimal>
{
	private static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;
	
	public BigDecimalBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
