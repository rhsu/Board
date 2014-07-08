package rhsu.compositeBoard.implementations;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.BoardImpl;
import rhsu.board2.random.RandomBoard;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.CompositeBoardImpl;
import rhsu.compositeBoard.Matrix;
import rhsu.compositeBoard.MobilityBoard;

public class IntegerBoard2Composite extends CompositeBoardImpl<Integer>
{	
	static final Integer DEFAULT_VALUE = 0;

	public IntegerBoard2Composite(Board2<Integer> boardCore, 
		BoardIO boardIO, 
		Matrix<Integer> matrix, 
		MobilityBoard<Integer> mobilityBoard, 
		RandomBoard<Integer> randomBoard)
	{
		super(boardCore, boardIO, matrix, mobilityBoard, randomBoard);
	}
	
	public static CompositeBoard<Integer> createIntegerBoard(int horizontalSize, 
		int verticalSize,
		Integer defaultValue)
	{
		return new BoardBuilder()
			.setBoardCore(new BoardImpl<Integer>(horizontalSize, verticalSize, defaultValue) )
			.createBoard();
	}
	
	public static CompositeBoard<Integer> createIntegerBoard(int horizontalSize, int verticalSize)
	{		
		return createIntegerBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
