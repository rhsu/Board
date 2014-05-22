package rhsu.board2.basic.implementations.arithmetic;

import java.math.BigDecimal;
import rhsu.board2.basic.BoardImpl;

public class BigDecimalBoard2 extends BoardImpl<BigDecimal>
{
	private static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;
	
	public BigDecimalBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
