package rhsu.board2.implementations;

import rhsu.board2.implementations.CharacterBoard2;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.Board2ImplIntIntTest;
import rhsu.board2.factory.BoardFactory;

public class CharacterBoard2IntIntTest extends Board2ImplIntIntTest
{	
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(CharacterBoard2.class, horizontalSize, verticalSize);
		board = boardFactory.createBoard();
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		assertEquals(CharacterBoard2.DEFAULT_VALUE, board.getDefaultValue());
	}
}