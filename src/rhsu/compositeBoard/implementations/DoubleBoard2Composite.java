package rhsu.compositeBoard.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.DoubleRandomGenerator;

public class DoubleBoard2Composite
{
	static final double DEFAULT_VALUE = 0.0;
	
	public static CompositeBoard<Double> createDoubleBoard(int horizontalSize, 
		int verticalSize,
		Double defaultValue)
	{
		return new BoardBuilder()
			.setVerticalSize(verticalSize)
			.setHorizontalSize(horizontalSize)
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<Double> createDoubleBoard(int horizontalSize, int verticalSize)
	{		
		return createDoubleBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public static CompositeBoard<Double> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(new DoubleRandomGenerator())
			.createBoard();
	}
}
