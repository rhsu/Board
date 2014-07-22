package rhsu.board2.random.implementations;

import java.math.BigDecimal;
import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.BigDecimalRandomGenerator;

public class BigDecimalRandomBoard 
{	
	public static CompositeBoard<BigDecimal> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(new BigDecimalRandomGenerator())
			.createBoard();
	}
}
