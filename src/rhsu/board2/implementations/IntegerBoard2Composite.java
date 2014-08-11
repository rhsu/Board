package rhsu.board2.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;
import rhsu.board2.randomGenerators.IntegerRandomGenerator;

public class IntegerBoard2Composite
{	
	static final Integer DEFAULT_VALUE = 0;
	
	public static CompositeBoard<Integer> createIntegerBoard(int horizontalSize, 
		int verticalSize,
		Integer defaultValue)
	{
		return new BoardBuilder<Integer>()
			.setVerticalSize(verticalSize)
			.setHorizontalSize(horizontalSize)
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<Integer> createIntegerBoard(int horizontalSize, int verticalSize)
	{		
		return createIntegerBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public static CompositeBoard<Integer> createIntegerRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		AbstractRandomGenerator<Integer> randomGenerator = new IntegerRandomGenerator();
		
		return new BoardBuilder<Integer>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(randomGenerator)
			.setBoardInitializable(randomGenerator)
			.createBoard();
	}
}
