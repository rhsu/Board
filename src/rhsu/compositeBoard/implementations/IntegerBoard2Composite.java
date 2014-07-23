package rhsu.compositeBoard.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.IntegerRandomGenerator;

public class IntegerBoard2Composite
{	
	static final Integer DEFAULT_VALUE = 0;
	
	public static CompositeBoard<Integer> createIntegerBoard(int horizontalSize, 
		int verticalSize,
		Integer defaultValue)
	{
		return new BoardBuilder()
			.setVerticalSize(verticalSize)
			.setHorizontalSize(horizontalSize)
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<Integer> createIntegerBoard(int horizontalSize, int verticalSize)
	{		
		return createIntegerBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public static CompositeBoard<Integer> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(new IntegerRandomGenerator())
			.createBoard();
	}
}
