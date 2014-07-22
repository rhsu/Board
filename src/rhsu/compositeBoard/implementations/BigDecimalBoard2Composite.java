package rhsu.compositeBoard.implementations;

import java.math.BigDecimal;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;

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
