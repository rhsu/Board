package rhsu.compositeBoard.implementations;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.matrix2.Matrix2;
import rhsu.board2.random.RandomBoard;
import rhsu.compositeBoard.MobilityBoard;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;


public class BooleanBoard2Composite
{
	static final Boolean DEFAULT_VALUE = false;

	public static CompositeBoard<Boolean> createBooleanBoard(int horizontalSize, 
		int verticalSize,
		Boolean defaultValue)
	{
		return new BoardBuilder()
			.setDefaulValue(DEFAULT_VALUE)
			.createBoard();
	}
	
	public static CompositeBoard<Boolean> createBooleanBoard(int horizontalSize, int verticalSize)
	{		
		return createBooleanBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
