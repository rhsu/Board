package rhsu.board.basic.implementations;

import static org.junit.Assert.*;
import org.junit.*;
import rhsu.board.resources.ResourceRetriever;

public class StringBoardTest 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String testResource = "/rhsu/board/resources/test/";
	private static final StringBoard TEST_BOARD = new StringBoard(
		ResourceRetriever.GetResource("testStringBoard", testResource));
	//</editor-fold>
	
	@Test
	public void testResourceRetriever()
	{
		assertEquals(TEST_BOARD, new StringBoard(2,2));
	}
	
	//<editor-fold desc="Unit Tests For Equals" defaultstate="collapsed">
	 
	@Test
	public void testEqualsSelf()
	{
		assertEquals(TEST_BOARD, TEST_BOARD);
	}
	
	@Test
	public void testNotEqualsNull()
	{
		assertFalse(TEST_BOARD.equals(null));
	}
	
	@Test
	public void testEquals()
	{
		assertEquals(TEST_BOARD, new StringBoard(2,2));
	}
	
	@Test
	public void testNotEqualsDifferentBoard()
	{
		assertFalse
		(
			TEST_BOARD.equals(
				new StringBoard(ResourceRetriever.GetResource("ExampleIntegerBoard")))
		);
	}
	
	//</editor-fold>
}

