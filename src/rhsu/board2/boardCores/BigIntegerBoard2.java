package rhsu.board2.boardCores;

import java.math.BigInteger;
import rhsu.board2.BoardImpl;

public class BigIntegerBoard2 extends BoardImpl<BigInteger>
{
	static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;
	
	public BigIntegerBoard2(int horizontalSize, int verticalSize, BigInteger defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public BigIntegerBoard2(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
