package rhsu.board3.implementations;

import rhsu.board3.Board3;
import rhsu.board3.Board3TestCaseBase;

public class TestArrayBoard3 extends Board3TestCaseBase
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	
	private final int HORIZONTAL_SIZE = 50;
	private final int VERTICAL_SIZE = 25;
	
	private Board3<Integer> board;
	
	//</editor-fold>
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
	public TestArrayBoard3(String method) 
	{
		super(method);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="SetUp">
	
	@Override
	public void setUp()
	{
		board = new ArrayBoard3<>(HORIZONTAL_SIZE, VERTICAL_SIZE);
	}
	
	//</editor-fold>
	
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
