package rhsu.board2.random.implementations;

import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.IntegerRandomGenerator;

public class IntegerRandomBoard 
{
	public static CompositeBoard<Integer> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(new IntegerRandomGenerator())
			.createBoard();
	}
}
