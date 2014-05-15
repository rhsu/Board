package rhsu.board2.basic.implementations.arithmetic;

import org.junit.*;
import rhsu.board2.basic.Board2IntIntImplTest;
import rhsu.board2.boardFactory.BoardFactory;

public class DoubleBoard2IntIntTest extends Board2IntIntImplTest
{
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(horizontalSize, verticalSize);
		board = boardFactory.createDoubleBoard();
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		assert(board.getDefaultValue() == (Double)0.0);
	}
}
