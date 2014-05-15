package rhsu.board2.basic;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.Board2Test;

public class Board2IntIntImplTest extends Board2Test
{	
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		board = new Board2Impl(horizontalSize,verticalSize);
	}
	
	@Test
	@Override
	public void testGetHorizontalSize()
	{
		super.testGetHorizontalSize();
	}
	
	@Test
	@Override
	public void testGetVerticalSize()
	{
		super.testGetVerticalSize();
	}
	
	@Test
	@Override
	public void testGetSize()
	{
		super.testGetSize();
	}
}