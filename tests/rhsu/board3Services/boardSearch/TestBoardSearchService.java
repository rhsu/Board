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
	
	//<editor-fold defaultstate="collapsed" desc="containsValue">
	
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
	public void testContainsValue2()
	{
		boolean contains = BoardSearchService.containsValue(VALUE, testBoard);
		assertFalse(contains);
	}

	// TODO: Test throws null exception
	
	//</editor-fold>

	//<editor-fold desc="containsInstance" defaultstate="collapsed">
	
	/**
	 * test board contains the instance
	 */
	public void testContainsInstance1()
	{
		testBoard.setValueAt(10, 5, VALUE);
		boolean contains = BoardSearchService.containsInstance(VALUE, testBoard);
		assertTrue(contains);
	}
	
	/**
	 * test board contains the same value but NOT the same instance
	 */
	public void testContainsInstance2()
	{
		Integer otherValue = -99000;
		testBoard.setValueAt(10, 5, VALUE);
		boolean contains = BoardSearchService.containsInstance(otherValue, testBoard);
		assertFalse(contains);
	}
	
	/**
	 * test board does NOT contain the same value or the same instance
	 */
	public void testContainsInstance3()
	{
		Integer nonsense = 65;
		testBoard.setValueAt(10, 5, VALUE);
		boolean contains = BoardSearchService.containsInstance(nonsense, testBoard);
		assertFalse(contains);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="getInstance" defaultstate="collapsed">
	
	/*public void testGetInstance1()
	{
		testBoard.setValueAt(5, 3, VALUE);
		BoardSearchResult<Integ
	}*/
	
	//</editor-fold>
	
	//<editor-fold desc="getValue" defaultstate="collapsed">
	
	/**
	 * test that the board contains the value
	 */
	public void testGetValue1()
	{
		testBoard.setValueAt(5, 3, VALUE);
		BoardSearchResult<Integer> searchResult = 
			BoardSearchService.getValue(VALUE, testBoard);
		assertEquals(searchResult.getHorizontalIndex(), 5);
		assertEquals(searchResult.getVerticalIndex(), 3);
		assertEquals(searchResult.getValue(), VALUE);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="getAllInstances" defaultstate="collapsed">
	public void testGetAllInstances()
	{
		// TODO: Unit test this;
	}
	
	//</editor-fold>
	
	//<editor-fold desc="getAllValues" defaultstate="collapsed">
	public void testGetAllValues()
	{
		// TODO: Unit test this;
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Custom Asserts" defaultstate="collapsed">
	
	public static <T> void assertNotNullBoardSearchResult(
		BoardSearchResult<T> boardSearchResult)
	{
		if (boardSearchResult == BoardSearchResult.GetNullResult())
			fail("the board search result is a null result");
	}
	
	//</editor-fold>
}
