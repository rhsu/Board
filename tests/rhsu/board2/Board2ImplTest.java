package rhsu.board2;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.factory.BoardFactory;

public class Board2ImplTest extends Board2Test
{	
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(BoardImpl.class, horizontalSize, verticalSize);		
		board = boardFactory.createBoard();
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		assertEquals(BoardImpl.DEFAULT_VALUE, board.getDefaultValue());
	}
}