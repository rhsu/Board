package rhsu.compositeBoard.implementations;

import java.math.BigInteger;
import rhsu.board2.BoardImpl;

public class BigIntegerBoard2Composite extends BoardImpl<BigInteger>
{
	static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;
	
	public BigIntegerBoard2Composite(int horizontalSize, int verticalSize, BigInteger defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public BigIntegerBoard2Composite(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
