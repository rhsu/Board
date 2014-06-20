package rhsu.board2.random.implementations;

import java.math.BigInteger;
import rhsu.board2.implementations.BigIntegerBoard2;

public class BigIntegerBoardRandom extends BigIntegerBoard2
{
	public BigIntegerBoardRandom(int horizontalSize, int verticalSize, BigInteger defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public BigIntegerBoardRandom(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
}
