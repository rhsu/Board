package rhsu.board2.random.implementations;

import rhsu.board2.random.RandomGenerator;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.DoubleRandomGenerator;

public class DoubleRandomBoard 
{
	public static CompositeBoard<Double> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomBoard((RandomGenerator<Double>) new DoubleRandomGenerator())
			.createBoard();
	}
}
