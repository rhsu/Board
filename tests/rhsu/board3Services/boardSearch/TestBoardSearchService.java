package rhsu.board3Services.boardSearch;

import rhsu.board3.Board3;
import rhsu.board3.Board3TestCaseBase;
import rhsu.board3.implementations.ArrayBoard3;

public class TestBoardSearchService extends Board3TestCaseBase
{
	private static final int HORIZONTAL_SIZE = 12;
	private static final int VERTICAL_SIZE = 34;
	private static final Integer VALUE = -99000;
	
	private Board3<Integer> testBoard;
	
	
	public TestBoardSearchService(String method) 
	{
		super(method);
	}
	
	@Override
	public void setUp()
	{
		testBoard = new ArrayBoard3<>(HORIZONTAL_SIZE, VERTICAL_SIZE, null);
	}
	
	/**
	 * put value into testBoard
	 * test that testBoard contains value
	 */
	public void testContainsValue1()
	{
		testBoard.setValueAt(0, 0, VALUE);
		boolean contains = BoardSearchService.containsValue(VALUE, testBoard);
		assertTrue(contains);
	}
	
	/**
	 * test board does not contain value
	 */
	public void testContainsValue2()
	{
		boolean contains = BoardSearchService.containsValue(VALUE, testBoard);
		assertFalse(contains);
	}
}
