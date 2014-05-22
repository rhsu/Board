package rhsu.board2;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.basic.implementations.StringBoard2;
import rhsu.board2.factory.BoardFactory;

@Ignore
public class Board2Test
{
	protected Board2 board;
	protected BoardFactory boardFactory;
	
	@Before
	public void createBoard()
	{
		
	}
	
	@Test
	public void testBoardNotNull()
	{
		assertNotNull(board);
	}
	
	@Test
	public void testGetHorizontalSize() 
	{ 
		assert(board.getHorizontalSize() == boardFactory.getHorizontalSize());
	}
	
	@Test
	public void testGetVerticalSize()
	{
		assert(board.getVerticalSize() == boardFactory.getVerticalSize());
	}
	
	@Test
	public void testGetSize()
	{
		int size = boardFactory.getHorizontalSize() * boardFactory.getVerticalSize();
		
		assert(board.getSize() == size);
	}
	
	@Test
	public void testGetDefaultValue()
	{
		assert(board.getDefaultValue() == null);
	}
	
	@Test
	public void testEqualsSelf()
	{
		assertEquals(board, board);
	}
	
	
	/**
	 * Tests that the same hash code is generated if the two boards are equals
	 */
	@Test
	public void testEqualsSelfSameHashCode()
	{
		assertEquals(board.hashCode(), board.hashCode() );
	}
	
	@Test
	public void testEqualsSimilarBoard()
	{
		Board2 sameBoard = boardFactory.createBoard();
		assertEquals(sameBoard, board);
	}
	
	@Test
	public void testSimliarBoardSameHashCode()
	{
		Board2 sameBoard = boardFactory.createBoard();
		assertEquals(board.hashCode(), sameBoard.hashCode());
	}
	
	@Test
	public void testDoesNotEqualDifferentBoardSameTypeDifferentDimension()
	{
		Board2 differentBoard = boardFactory.createBoard(100, 200);
		assertFalse(board.equals(differentBoard));
	}
	
	@Test
	public void testDoesNotEqualDifferentBoardDifferentType()
	{
		Board2<String> stringBoard = BoardFactory.createFactory(
			StringBoard2.class, 
			boardFactory.getHorizontalSize(),
			boardFactory.getVerticalSize())
			.createBoard();
		
		assertFalse(board.equals(stringBoard));
	}
}
