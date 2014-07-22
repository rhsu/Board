package rhsu.compositeBoard.implementations;

import java.math.BigDecimal;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.matrix2.Matrix2;
import rhsu.board2.random.RandomBoard;
import rhsu.compositeBoard.MobilityBoard;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;

public class BigDecimalBoard2Composite
{
	static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;
	
	public static CompositeBoard<BigDecimal> createBigDecimalBoard(int horizontalSize, 
		int verticalSize,
		BigDecimal defaultValue)
	{	
		return new BoardBuilder()
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<BigDecimal> createBigDecimalBoard(int horizontalSize, int verticalSize)
	{		
		return createBigDecimalBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
