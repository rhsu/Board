package rhsu.compositeBoard.implementations;

import java.math.BigDecimal;
import rhsu.board.io.BoardIO;
import rhsu.board2.random.RandomBoard;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.Matrix;
import rhsu.compositeBoard.MobilityBoard;

public class BigDecimalBoard2Composite //extends CompositeBoardImpl<BigDecimal>
{
	static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;
	
	public BigDecimalBoard2Composite(
		Integer horizontalSize,
		Integer verticalSize,
		BoardIO boardIO,
		Matrix<BigDecimal> matrix, 
		MobilityBoard<BigDecimal> mobilityBoard, 
		RandomBoard<BigDecimal> randomBoard,
		BigDecimal defaultValue)
	{
		//super(horizontalSize, verticalSize, boardIO, matrix, mobilityBoard, randomBoard, defaultValue);
	}

	public static CompositeBoard<BigDecimal> createBigDecimalBoard(int horizontalSize, 
		int verticalSize,
		BigDecimal defaultValue)
	{	
		return new BoardBuilder()
			.setDefaulValue(DEFAULT_VALUE)
			.createBoard();
	}
	
	public static CompositeBoard<BigDecimal> createBigDecimalBoard(int horizontalSize, int verticalSize)
	{		
		return createBigDecimalBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
