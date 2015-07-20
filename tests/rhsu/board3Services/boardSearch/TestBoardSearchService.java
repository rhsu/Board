package rhsu.board3Services.boardSearch;

import rhsu.board3.Board3;
import rhsu.board3.Board3TestCase;
import rhsu.board3.implementations.ArrayBoard3;

public class TestBoardSearchService extends Board3TestCase
{
	private static final int HORIZONTAL_SIZE = 12;
	private static final int VERTICAL_SIZE = 34;
	private static final Integer VALUE = -99000;
	
	private Board3<Integer> testBoard;
	
	//<editor-fold desc="Constrcutor" defaultstate="Collapsed">
	
	public TestBoardSearchService(String method) 
	{
		super(method);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="SetUp" defaultstate="collapsed">
	
	@Override
	public void setUp()
	{
		testBoard = new ArrayBoard3<>(HORIZONTAL_SIZE, VERTICAL_SIZE, null);
	}
	
	//</editor-fold>
	
	/**
	 * put value into testBoard
	 * test that testBoard contains value
	 */
	public void testContainsValue1()
	{
		testBoard.setValueAt(10, 5, VALUE);
		boolean contains = BoardSearchService.containsValue(VALUE, testBoard);
		assertTrue(contains);
	}
	
	/**
	 * test board does not contain value
	 */
	/*public void testContainsValue2()
	{
		boolean contains = BoardSearchService.containsValue(VALUE, testBoard);
		assertFalse(contains);
	}*/
}
