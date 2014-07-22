package rhsu.board2.random.implementations;

import java.math.BigInteger;
import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.BigIntegerRandomGenerator;

public class BigIntegerRandomBoard 
{
	public static CompositeBoard<BigInteger> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(new BigIntegerRandomGenerator())
			.createBoard();
	}
}
