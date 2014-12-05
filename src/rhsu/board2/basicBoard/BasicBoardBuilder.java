package rhsu.board2.basicBoard;

import rhsu.board2.AbstractBoardBuilder;
import rhsu.board2.Board2;

public class BasicBoardBuilder<T> extends AbstractBoardBuilder<T>
{
	@Override
	public Board2<T> createBoard()
	{		
		return new BasicBoard(
			this.horizontalSize,
			this.verticalSize,
			this.boardIO,
			this.matrix,
			this.mobilityBoard,
			this.randomGenerator,
			this.defaultValue,
			this.boardInitializer);
	}
}
