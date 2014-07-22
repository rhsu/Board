package rhsu.board2.random.implementations;

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
			.setRandomGenerator(new DoubleRandomGenerator())
			.createBoard();
	}
}
