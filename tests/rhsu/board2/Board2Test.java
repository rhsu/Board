package rhsu.board2;

import org.junit.*;
import rhsu.board2.boardFactory.BoardFactory;

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
}
