package rhsu.board2.random.implementations;

import rhsu.board2.random.RandomGenerator;
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
			.setRandomBoard((RandomGenerator<Integer>) new IntegerRandomGenerator())
			.createBoard();
	}
}
