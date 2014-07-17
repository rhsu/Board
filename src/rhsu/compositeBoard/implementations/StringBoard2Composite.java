package rhsu.compositeBoard.implementations;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.BoardImpl;
import rhsu.board2.random.RandomBoard;
import rhsu.compositeBoard.BoardConfigurator;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.CompositeBoardImpl;
import rhsu.compositeBoard.Matrix;
import rhsu.compositeBoard.MobilityBoard;

public class StringBoard2Composite extends CompositeBoardImpl<String>
{
	static final String DEFAULT_VALUE = "++";

	public StringBoard2Composite(Board2<String> boardCore, 
		BoardIO boardIO, 
		Matrix<String> matrix, 
		MobilityBoard<String> mobilityBoard, 
		RandomBoard<String> randomBoard)
	{
		super(boardCore, boardIO, matrix, mobilityBoard, randomBoard);
	}
	
	public static CompositeBoard<String> createStringBoard(int horizontalSize, 
		int verticalSize,
		String defaultValue)
	{
		return new BoardConfigurator()
			.setBoardCore(new BoardImpl<String>(horizontalSize, verticalSize, defaultValue) )
			.createBoard();
	}
	
	public static CompositeBoard<String> createStringBoard(int horizontalSize, int verticalSize)
	{		
		return createStringBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
