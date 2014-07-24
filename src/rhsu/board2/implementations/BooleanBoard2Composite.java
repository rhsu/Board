package rhsu.board2.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;
import rhsu.board2.randomGenerators.BooleanRandomGenerator;

public class BooleanBoard2Composite
{
	static final Boolean DEFAULT_VALUE = false;

	public static CompositeBoard<Boolean> createBooleanBoard(int horizontalSize, 
		int verticalSize,
		Boolean defaultValue)
	{
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setDefaulValue(DEFAULT_VALUE)
			.createBoard();
	}
	
	public static CompositeBoard<Boolean> createBooleanBoard(int horizontalSize, int verticalSize)
	{		
		return createBooleanBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public static CompositeBoard<Boolean> createRandomBooleanBoard(int horizontalSize, int verticalSize)
	{
		AbstractRandomGenerator<Boolean> randomGenerator = new BooleanRandomGenerator();
		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(randomGenerator)
			.setBoardInitializable(randomGenerator)
			.createBoard();
	}
}
