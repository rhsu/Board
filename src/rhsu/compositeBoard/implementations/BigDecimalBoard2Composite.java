package rhsu.compositeBoard.implementations;

import java.math.BigDecimal;
import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.boardCores.BigDecimalBoard2;
import rhsu.board2.random.RandomBoard;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.CompositeBoardImpl;
import rhsu.compositeBoard.Matrix;
import rhsu.compositeBoard.MobilityBoard;

public class BigDecimalBoard2Composite extends CompositeBoardImpl<BigDecimal>
{
	static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;
	
	public BigDecimalBoard2Composite(
		Board2<BigDecimal> boardCore, 
		BoardIO boardIO,
		Matrix<BigDecimal> matrix, 
		MobilityBoard<BigDecimal> mobilityBoard, 
		RandomBoard<BigDecimal> randomBoard)
	{
		super(boardCore, boardIO, matrix, mobilityBoard, randomBoard);
	}
	
	public static CompositeBoard<BigDecimal> getBigDecimalBoard2(int horizontalSize, int verticalSize)
	{
		return new BoardBuilder()
			.setBoardCore(new BigDecimalBoard2(horizontalSize, verticalSize) )
			.createBoard();
	}
}
