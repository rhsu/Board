package rhsu.board2.basic.implementations;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.basic.Board2ImplIntIntTest;
import rhsu.board2.factory.BoardFactory;

public class BooleanBoard2IntIntTest extends Board2ImplIntIntTest
{
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(horizontalSize, verticalSize);
		board = boardFactory.createBooleanBoard();
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		assertEquals(false, board.getDefaultValue());
	}
}
