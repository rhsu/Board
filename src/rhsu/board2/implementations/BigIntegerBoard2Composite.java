package rhsu.board2.implementations;

import java.math.BigInteger;
import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.randomGenerators.BigIntegerRandomGenerator;

public class BigIntegerBoard2Composite
{
	static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;
	
	public static CompositeBoard<BigInteger> createBigIntegerBoard(int horizontalSize, 
		int verticalSize,
		BigInteger defaultValue)
	{
		return new BoardBuilder()
			.setVerticalSize(verticalSize)
			.setHorizontalSize(horizontalSize)
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<BigInteger> createBigIntegerBoard(int horizontalSize, int verticalSize)
	{		
		return createBigIntegerBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public static CompositeBoard<BigInteger> createBigIntegerRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(new BigIntegerRandomGenerator())
			.createBoard();
	}
}
