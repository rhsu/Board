package rhsu.board2;

import rhsu.board2.implementations.factories.BoardFactory;
import rhsu.board2.implementations.factories.BoardFactoryClient;


public class IntegerBoardTest extends Board2Test<Integer>
{
	@Override
	public void createBoard()
	{
		BoardFactory<Integer> boardFactory = new BoardFactoryClient().GetIntegerBoardFactory();
		
		board = boardFactory.createBoard(this.horizontalSize, this.verticalSize);
		sameBoard = boardFactory.createBoard(this.horizontalSize, this.verticalSize);
	}

	@Override
	public void testBoardNotNull()
	{
		
	}
}
