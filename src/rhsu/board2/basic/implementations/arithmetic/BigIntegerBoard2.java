package rhsu.board2.basic.implementations.arithmetic;

import java.math.BigInteger;
import rhsu.board2.basic.BoardImpl;

public class BigIntegerBoard2 extends BoardImpl<BigInteger>
{
	private static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;
	
	public BigIntegerBoard2(int horizontalSize, int verticalSize, BigInteger defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public BigIntegerBoard2(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
