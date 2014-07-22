package rhsu.compositeBoard.implementations;

import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;

public class IntegerBoard2Composite
{	
	static final Integer DEFAULT_VALUE = 0;
	
	public static CompositeBoard<Integer> createIntegerBoard(int horizontalSize, 
		int verticalSize,
		Integer defaultValue)
	{
		return new BoardBuilder()
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<Integer> createIntegerBoard(int horizontalSize, int verticalSize)
	{		
		return createIntegerBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}