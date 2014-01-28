package rhsu.board.basic.implementations;

import rhsu.board.implementations.basic.CharBoard;
import rhsu.board.implementations.basic.StringBoard;
import static org.junit.Assert.*;
import org.junit.*;
import rhsu.board.resources.ResourceRetriever;

public class TestCharBoard 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	private static final CharBoard TEST_BOARD = new CharBoard(
		ResourceRetriever.GetResource("testCharBoard", TEST_RESOURCE));
	//</editor-fold>
	
	@Test
	public void testResourceRetriever()
	{
		assertEquals(TEST_BOARD, new CharBoard(2,2));
	}
	
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
		assertEquals(TEST_BOARD, new CharBoard(2,2));
	}
	
	@Test
	public void testNotEqualsDifferentBoard()
	{
		assertFalse
		(
			TEST_BOARD.equals(
				new StringBoard(ResourceRetriever.GetResource("testStringBoard", TEST_RESOURCE)))
		);
	}
}
