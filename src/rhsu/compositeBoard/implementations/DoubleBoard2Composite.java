package rhsu.compositeBoard.implementations;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.matrix.Matrix2;
import rhsu.board2.boardCores.DoubleBoard2;
import rhsu.board2.random.RandomBoard;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.CompositeBoardImpl;
import rhsu.compositeBoard.MobilityBoard;

public class DoubleBoard2Composite extends CompositeBoardImpl<Double>
{
	static final double DEFAULT_VALUE = 0.0;
	
	public DoubleBoard2Composite(Board2<Double> boardCore, 
		BoardIO boardIO, 
		Matrix2<Double> matrix, 
		MobilityBoard<Double> mobilityBoard, 
		RandomBoard<Double> randomBoard)
	{
		super(boardCore, boardIO, matrix, mobilityBoard, randomBoard);
	}
	
	public static CompositeBoard<Double> createDoubleBoard(int horizontalSize, 
		int verticalSize,
		Double defaultValue)
	{
		return new BoardBuilder()
			.setBoardCore(new DoubleBoard2(horizontalSize, verticalSize, defaultValue) )
			.createBoard();
	}
	
	public static CompositeBoard<Double> createDoubleBoard(int horizontalSize, int verticalSize)
	{		
		return createDoubleBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
