package rhsu.board2.boardCores;

import rhsu.board2.boardCores.CharacterBoard2;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.Board2ImplTest;
import rhsu.board2.factory.BoardFactory;

public class CharacterBoard2Test extends Board2ImplTest
{	
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = BoardFactory.createFactory(CharacterBoard2.class, horizontalSize, verticalSize);
		board = boardFactory.createBoard();
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		assertEquals(CharacterBoard2.DEFAULT_VALUE, board.getDefaultValue());
	}
	
	@Test
	@Override
	public void testSetPieceAt()
	{
		Character setValue = '5';
		board.setPieceAt(2, 3, setValue);

		assertEquals(board.getPieceAt(2,3).getValue(), setValue);
	}
}
