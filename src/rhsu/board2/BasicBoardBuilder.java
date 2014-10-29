package rhsu.board2;

public class BasicBoardBuilder<T> extends AbstractBoardBuilder
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
