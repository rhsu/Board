package rhsu.board2.implementations;

import java.math.BigInteger;
import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.boardReaders.AbstractBoardIO;
import rhsu.board2.boardReaders.BigIntegerBoardIO;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;
import rhsu.board2.randomGenerators.BigIntegerRandomGenerator;

public class BigIntegerBoard2Composite
{
	static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;
	
	public static CompositeBoard<BigInteger> createBigIntegerBoard(int horizontalSize, 
		int verticalSize,
		BigInteger defaultValue)
	{
		return new BoardBuilder<BigInteger>()
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
		AbstractRandomGenerator<BigInteger> randomGenerator = new BigIntegerRandomGenerator();
		
		return new BoardBuilder<BigInteger>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(randomGenerator)
			.setBoardInitializable(randomGenerator)
			.createBoard();
	}
	
	public static CompositeBoard<BigInteger> createBigIntegerBoardFromFile(String filename)
	{
		AbstractBoardIO<BigInteger> stringBoardIO = new BigIntegerBoardIO(filename);
		
		return new BoardBuilder<BigInteger>()
			.setHorizontalSize(stringBoardIO.getBoardInitializer().getHorizontalSize())
			.setVerticalSize(stringBoardIO.getBoardInitializer().getVerticalSize())
			.setBoardIO(stringBoardIO)
			.setBoardInitializable(stringBoardIO)
			.createBoard();
	}
}
