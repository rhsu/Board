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
	
	@Ignore
	public void testGetHorizontalSize() 
	{ 
		assert(board.getHorizontalSize() == 20);
	}
	
	@Ignore
	public void testGetVerticalSize()
	{
		assert(board.getVerticalSize() == 30);
	}
	
	@Ignore
	public void testGetSize()
	{
		assert(board.getSize() == 600);
	}
	
	@Ignore
	public void testGetDefaultValue()
	{
	}
}
