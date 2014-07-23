package rhsu.compositeBoard.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.StringRandomGenerator;

public class StringBoard2Composite
{
	static final String DEFAULT_VALUE = "++";
	
	public static CompositeBoard<String> createStringBoard(int horizontalSize, 
		int verticalSize,
		String defaultValue)
	{
		return new BoardBuilder()
			.setVerticalSize(verticalSize)
			.setHorizontalSize(horizontalSize)
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<String> createStringBoard(int horizontalSize, int verticalSize)
	{		
		return createStringBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public static CompositeBoard<String> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(new StringRandomGenerator())
			.createBoard();
	}
}
