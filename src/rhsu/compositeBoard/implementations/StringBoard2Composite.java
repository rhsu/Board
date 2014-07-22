package rhsu.compositeBoard.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;

public class StringBoard2Composite
{
	static final String DEFAULT_VALUE = "++";
	
	public static CompositeBoard<String> createStringBoard(int horizontalSize, 
		int verticalSize,
		String defaultValue)
	{
		return new BoardBuilder()
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<String> createStringBoard(int horizontalSize, int verticalSize)
	{		
		return createStringBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
