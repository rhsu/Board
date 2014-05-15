package rhsu.board2;

import org.junit.*;
import static org.junit.Assert.*;

@Ignore
public class Board2Test
{
	protected Board2 board;
	
	@Before
	public void createBoard()
	{
		
	}
	
	@Test
	public void testGetHorizontalSize() 
	{ 
		assert(board.getHorizontalSize() == 20);
	}
	
	@Test
	public void testGetVerticalSize()
	{
		assert(board.getVerticalSize() == 30);
	}
	
	@Test
	public void testGetSize()
	{
		assert(board.getSize() == 600);
	}
	
	@Test
	public void testGetDefaultValue()
	{
		assert(board.getDefaultValue() == null);
	}
}
