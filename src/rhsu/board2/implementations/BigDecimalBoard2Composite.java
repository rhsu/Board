package rhsu.board2.implementations;

import java.math.BigDecimal;
import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;
import rhsu.board2.randomGenerators.BigDecimalRandomGenerator;

public class BigDecimalBoard2Composite
{	
	static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;
	
	public static CompositeBoard<BigDecimal> createBigDecimalBoard(int horizontalSize, 
		int verticalSize,
		BigDecimal defaultValue)
	{	
		return new BoardBuilder<BigDecimal>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<BigDecimal> createBigDecimalBoard(int horizontalSize, int verticalSize)
	{		
		return createBigDecimalBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public static CompositeBoard<BigDecimal> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{	
		AbstractRandomGenerator<BigDecimal> randomGenerator = new BigDecimalRandomGenerator();
		
		return new BoardBuilder<BigDecimal>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(randomGenerator)
			.setBoardInitializable(randomGenerator)
			.createBoard();
	}
}
