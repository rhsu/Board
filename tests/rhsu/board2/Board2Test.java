package rhsu.board2;

import org.junit.*;
import static org.junit.Assert.*;
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
	public void testEqualsSelf_SameHashCode()
	{
		assertEquals(board.hashCode(), board.hashCode() );
	}
	
	@Test
	public void testDoesNotEqualDifferentBoard()
	{
		//TODO: need to expand the board factory to do some new stuff
	}
	
	@Test
	public void testEqualsSame()
	{
		//TODO: Factory with Generics
	}
	
	@Test
	public void testEqualsSame_SameHashCode()
	{
		
	}
}
