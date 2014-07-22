package rhsu.board2.random.implementations;

import java.math.BigDecimal;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;

public class BigDecimalRandomBoard 
{
	public static CompositeBoard<BigDecimal> createBigDecimalRandomBoard()
	{
		//Object t = new RandomBigDecimalGenerator();
		
		return new BoardBuilder()
			.setHorizontalSize(10)
			.setVerticalSize(10)
			.setRandomBoard(null)
			.createBoard();
	}
}
