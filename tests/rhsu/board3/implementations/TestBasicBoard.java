package rhsu.board3.implementations;

import rhsu.board3.Board3;
import rhsu.board3.Board3TestCaseBase;

public class TestBasicBoard extends Board3TestCaseBase
{
	private final int HORIZONTAL_SIZE = 50;
	private final int VERTICAL_SIZE = 25;
	
	private Board3<Integer> board;
	
	public TestBasicBoard(String method) 
	{
		super(method);
	}
	
	@Override
	public void setUp()
	{
		board = new BasicBoard3<>(HORIZONTAL_SIZE, VERTICAL_SIZE);
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
