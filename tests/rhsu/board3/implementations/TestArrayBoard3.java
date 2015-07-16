package rhsu.board3.implementations;

import rhsu.board3.Board3;
import rhsu.board3.Board3TestCaseBase;

public class TestArrayBoard3 extends Board3TestCaseBase
{
	private final int HORIZONTAL_SIZE = 50;
	private final int VERTICAL_SIZE = 25;
	
	private Board3<Integer> board;
	
	public TestArrayBoard3(String method) 
	{
		super(method);
	}
	
	@Override
	public void setUp()
	{
		board = new ArrayBoard3<>(HORIZONTAL_SIZE, VERTICAL_SIZE);
	}
	
	public void testGetHorizontalSize()
	{
		assertEquals(board.getHorizontalSize(), HORIZONTAL_SIZE);
	}
	
	public void testGetVerticalSize()
	{
		assertEquals(board.getVerticalSize(), VERTICAL_SIZE);
	}
	
	public void testGetSize()
	{
		assertEquals(board.getSize(), HORIZONTAL_SIZE * VERTICAL_SIZE);
	}
}
