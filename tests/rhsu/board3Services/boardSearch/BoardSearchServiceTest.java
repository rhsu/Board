package rhsu.board3Services.boardSearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import rhsu.board3.Board3;
import rhsu.board3.implementations.ArrayBoard3;

public class BoardSearchServiceTest
{
	//<editor-fold desc="Memeber Variables and Constants" defaultstate="Collapsed">
	
	private static final int EXPECTED_HORIZONTAL_SIZE = 12;
	private static final int EXPECTED_VERTICAL_SIZE = 34;
	private static final Integer EXPECTED_VALUE = -99000;
	
	private Board3<Integer> testBoard;
	
	//</editor-fold>
	
	//<editor-fold desc="SetUp" defaultstate="collapsed">
	
	@Before public void setUp()
	{
		testBoard = new ArrayBoard3<>(EXPECTED_HORIZONTAL_SIZE, EXPECTED_VERTICAL_SIZE, null);
	}
	
	//</editor-fold>
	
	//<editor-fold defaultstate="collapsed" desc="containsValue">
	
	/**
	 * put value into testBoard
	 * test that testBoard contains value
	 */
	@Test public void containsValue1()
	{
		testBoard.setValueAt(10, 5, EXPECTED_VALUE);
		boolean contains = BoardSearchService.containsValue(EXPECTED_VALUE, testBoard);
		assertTrue(contains);
	}
	
	/**
	 * test board does not contain value
	 */
	@Test public void containsValue2()
	{
		boolean contains = BoardSearchService.containsValue(EXPECTED_VALUE, testBoard);
		assertFalse(contains);
	}

	// TODO: Test throws null exception
	
	//</editor-fold>

	//<editor-fold desc="containsInstance" defaultstate="collapsed">
	
	/**
	 * test board contains the instance
	 */
	@Test public void containsInstance1()
	{
		testBoard.setValueAt(10, 5, EXPECTED_VALUE);
		boolean contains = BoardSearchService.containsInstance(EXPECTED_VALUE, testBoard);
		assertTrue(contains);
	}
	
	/**
	 * test board contains the same value but NOT the same instance
	 */
	@Test public void containsInstance2()
	{
		Integer otherValue = -99000;
		testBoard.setValueAt(10, 5, EXPECTED_VALUE);
		boolean contains = BoardSearchService.containsInstance(otherValue, testBoard);
		assertFalse(contains);
	}
	
	/**
	 * test board does NOT contain the same value or the same instance
	 */
	@Test public void containsInstance3()
	{
		Integer nonsense = 65;
		testBoard.setValueAt(10, 5, EXPECTED_VALUE);
		boolean contains = BoardSearchService.containsInstance(nonsense, testBoard);
		assertFalse(contains);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="getInstance" defaultstate="collapsed">
	
	/*public void testGetInstance1()
	{
		//TODO: Review this unit test
		testBoard.setValueAt(5, 3, VALUE);
		BoardSearchResult<Integ
	}*/
	
	//</editor-fold>
	
	//<editor-fold desc="getValue" defaultstate="collapsed">
	
	/**
	 * test that the board contains the value
	 */
	@Test public void getValue1()
	{
		testBoard.setValueAt(5, 3, EXPECTED_VALUE);
		BoardSearchResult<Integer> searchResult = 
			BoardSearchService.getValue(EXPECTED_VALUE, testBoard);
		assertEquals(searchResult.getHorizontalIndex(), 5);
		assertEquals(searchResult.getVerticalIndex(), 3);
		assertEquals(searchResult.getValue(), EXPECTED_VALUE);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="getAllInstances" defaultstate="collapsed">
	
	@Test public void getAllInstances()
	{
		// TODO: Unit test this;
	}
	
	//</editor-fold>
	
	//<editor-fold desc="getAllValues" defaultstate="collapsed">
	
	@Test public void getAllValues()
	{
		// TODO: Unit test this;
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Custom Asserts" defaultstate="collapsed">
	
	public static <T> void assertNotNullBoardSearchResult(
		BoardSearchResult<T> boardSearchResult)
	{
		if (boardSearchResult == BoardSearchResult.GetNullSearchResult())
			fail("the board search result is a null result");
	}
	
	//</editor-fold>
}
