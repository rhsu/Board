package rhsu.board2.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.boardReaders.AbstractBoardIO;
import rhsu.board2.boardReaders.StringBoardIO;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;
import rhsu.board2.randomGenerators.StringRandomGenerator;

public class StringBoard2Composite
{
	static final String DEFAULT_VALUE = "++";
	
	public static CompositeBoard<String> createStringBoard(int horizontalSize, 
		int verticalSize,
		String defaultValue)
	{
		return new BoardBuilder<String>()
			.setVerticalSize(verticalSize)
			.setHorizontalSize(horizontalSize)
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<String> createStringBoard(int horizontalSize, int verticalSize)
	{		
		return createStringBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public static CompositeBoard<String> createStringRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		AbstractRandomGenerator<String> randomGenerator = new StringRandomGenerator();
		
		return new BoardBuilder<String>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(randomGenerator)
			.setBoardInitializable(randomGenerator)
			.createBoard();
	}
	
	public static CompositeBoard<String> createStringBoardFromFile(String filename)
	{
		AbstractBoardIO<String> stringBoardIO = new StringBoardIO();
		stringBoardIO.populateFromFile(filename, " ");
		
		return new BoardBuilder<String>()
			.setHorizontalSize(stringBoardIO.getBoardInitializer().getHorizontalSize())
			.setVerticalSize(stringBoardIO.getBoardInitializer().getVerticalSize())
			.setBoardIO(stringBoardIO)
			.setBoardInitializable(stringBoardIO)
			.createBoard();
	}
}
