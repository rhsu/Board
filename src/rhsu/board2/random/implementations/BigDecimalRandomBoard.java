package rhsu.board2.random.implementations;

import java.math.BigDecimal;
import rhsu.board2.random.RandomGenerator;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;

public class BigDecimalRandomBoard 
{	
	public static CompositeBoard<BigDecimal> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomBoard((RandomGenerator<BigDecimal>) new BigDecimalRandomBoard())
			.createBoard();
	}
}
