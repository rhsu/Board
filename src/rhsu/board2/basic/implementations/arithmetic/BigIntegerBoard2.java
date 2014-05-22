package rhsu.board2.basic.implementations.arithmetic;

import java.math.BigInteger;
import rhsu.board2.basic.BoardImpl;

public class BigIntegerBoard2 extends BoardImpl<BigInteger>
{
	private static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;
	
	public BigIntegerBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
