package rhsu.board2.expandableBoard;

import rhsu.board2.AbstractBoardBuilder;
import rhsu.board2.Board2;

public class ExpandableBoardBuilder<T> extends AbstractBoardBuilder<T>
{
	@Override
	public Board2<T> createBoard() 
	{
		return new ExpandableBoard(horizontalSize,
			verticalSize,
			boardIO,
			matrix,
			mobilityBoard,
			randomGenerator,
			defaultValue,
			boardInitializer);
	}
}
