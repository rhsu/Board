package rhsu.compositeBoard.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;

public class DoubleBoard2Composite
{
	static final double DEFAULT_VALUE = 0.0;
	
	public static CompositeBoard<Double> createDoubleBoard(int horizontalSize, 
		int verticalSize,
		Double defaultValue)
	{
		return new BoardBuilder()
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<Double> createDoubleBoard(int horizontalSize, int verticalSize)
	{		
		return createDoubleBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
