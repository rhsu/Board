package rhsu.board2.implementations;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.Board2;
import rhsu.board2.Board2ImplTest;
import rhsu.board2.factory.BoardFactory;

public class StringBoard2Test extends Board2ImplTest
{
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = BoardFactory.createFactory(StringBoard2.class, horizontalSize, verticalSize);
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
	
	@Test
	@Override
	public void testSetPieceAt()
	{
		String setValue = "String";
		board.setPieceAt(2, 3, setValue);

		assertEquals(board.getPieceAt(2,3).getValue(), setValue);
	}
}
