package rhsu.board2;

import org.junit.*;
import rhsu.board2.implementations.factories.BoardFactory;
import rhsu.board2.implementations.factories.BoardFactoryClient;

@Ignore
public class IntegerBoardTest extends AbstractBoard2Test<Integer>
{
	@Test
	@Override
	public void createBoard()
	{
		BoardFactory<Integer> boardFactory = new BoardFactoryClient().GetIntegerBoardFactory();
		
		board = boardFactory.createBoard(this.horizontalSize, this.verticalSize);
		sameBoard = boardFactory.createBoard(this.horizontalSize, this.verticalSize);
	}

	@Test
	@Override
	public void testGetDefaultValue()
	{
		assert(board.getDefaultValue() == 0);
	}

	@Ignore
	@Override
	public void testSetPieceAt()
	{

	}
}
