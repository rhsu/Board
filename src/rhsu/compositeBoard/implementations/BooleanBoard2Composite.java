package rhsu.compositeBoard.implementations;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.BoardImpl;
import rhsu.board2.matrix.Matrix2;
import rhsu.board2.random.RandomBoard;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.CompositeBoardImpl;
import rhsu.compositeBoard.MobilityBoard;

public class BooleanBoard2Composite extends CompositeBoardImpl<Boolean>
{
	static final Boolean DEFAULT_VALUE = false;

	public BooleanBoard2Composite(Board2<Boolean> boardCore, 
		BoardIO boardIO, 
		Matrix2<Boolean> matrix, 
		MobilityBoard<Boolean> mobilityBoard, 
		RandomBoard<Boolean> randomBoard)
	{
		super(boardCore, boardIO, matrix, mobilityBoard, randomBoard);
	}
	
	public static CompositeBoard<Boolean> createBooleanBoard(int horizontalSize, 
		int verticalSize,
		Boolean defaultValue)
	{
		return new BoardBuilder()
			.setBoardCore(new BoardImpl<Boolean>(horizontalSize, verticalSize, defaultValue) )
			.createBoard();
	}
	
	public static CompositeBoard<Boolean> createBooleanBoard(int horizontalSize, int verticalSize)
	{		
		return createBooleanBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
