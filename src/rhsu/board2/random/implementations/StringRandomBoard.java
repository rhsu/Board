package rhsu.board2.random.implementations;

import rhsu.board2.random.RandomGenerator;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.StringRandomGenerator;

public class StringRandomBoard 
{
	public static CompositeBoard<String> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomBoard((RandomGenerator<String>) new StringRandomGenerator())
			.createBoard();
	}
}
