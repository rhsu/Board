package rhsu.board2.implementations;

import rhsu.board2.implementations.IntegerBoard2;
import rhsu.board2.implementations.StringBoard2;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.Board2;
import rhsu.board2.Board2ImplIntIntTest;
import rhsu.board2.factory.BoardFactory;

public class StringBoard2IntIntTest extends Board2ImplIntIntTest
{
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(StringBoard2.class, horizontalSize, verticalSize);
		board = boardFactory.createBoard();
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		assertEquals(StringBoard2.DEFAULT_VALUE, board.getDefaultValue());
	}
	
	@Test
	@Override
	public void testDoesNotEqualDifferentBoardDifferentType()
	{
		Board2<Integer> integerBoard = BoardFactory.createFactory(
			IntegerBoard2.class, 
			boardFactory.getHorizontalSize(),
			boardFactory.getVerticalSize())
			.createBoard();
		
		assertFalse(board.equals(integerBoard));
	}
}
