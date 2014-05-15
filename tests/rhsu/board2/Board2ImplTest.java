package rhsu.board2;

import rhsu.board2.basic.Board2Impl;
import org.junit.*;
import static org.junit.Assert.*;

public class Board2ImplTest
{	
	private Board2Impl board2;
		
	@Before
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		board2 = new Board2Impl(horizontalSize,verticalSize);
	}
	
	@Test
	public void testBoardIntInt()
	{
		assert(board2.getHorizontalSize() == 20);
		assert(board2.getVerticalSize() == 30);
		assert(board2.getSize() == 600);
	}
}