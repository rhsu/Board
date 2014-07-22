package rhsu.board2.random.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.StringRandomGenerator;

public class StringRandomBoard 
{
	public static CompositeBoard<String> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(new StringRandomGenerator())
			.createBoard();
	}
}
