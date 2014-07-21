package rhsu.compositeBoard.implementations;

import java.math.BigDecimal;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;

public class BigDecimalBoard2Composite //extends CompositeBoardImpl<BigDecimal>
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
