package rhsu.compositeBoard.implementations;

import java.math.BigInteger;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;

public class BigIntegerBoard2Composite
{
	static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;

	public static CompositeBoard<BigInteger> createBigIntegerBoard(int horizontalSize, 
		int verticalSize,
		BigInteger defaultValue)
	{
		return new BoardBuilder()
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<BigInteger> createBigIntegerBoard(int horizontalSize, int verticalSize)
	{		
		return createBigIntegerBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
