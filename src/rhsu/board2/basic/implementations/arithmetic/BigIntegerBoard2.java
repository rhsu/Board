package rhsu.board2.basic.implementations.arithmetic;

import java.math.BigInteger;
import rhsu.board2.basic.Board2Impl;

public class BigIntegerBoard2 extends Board2Impl<BigInteger>
{
	private static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;
	
	public BigIntegerBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
