package rhsu.board.basic.implementations;

import static org.junit.Assert.*;
import org.junit.*;
import rhsu.board.resources.ResourceRetriever;

public class TestBooleanBoard 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	private static final BooleanBoard TEST_BOARD = new BooleanBoard(
		ResourceRetriever.GetResource("testBooleanBoard", TEST_RESOURCE));
	//</editor-fold>	
	
	@Test
	public void testResourceRetriever()
	{
		assertEquals(TEST_BOARD, new BooleanBoard(2,2));
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
		assertEquals(TEST_BOARD, new BooleanBoard(2,2));
	}
	
	@Test
	public void testNotEquals()
	{
		assertFalse
		(
			TEST_BOARD.equals(
				  new BooleanBoard(ResourceRetriever.GetResource("ExampleIntegerBoard")))
		);
	}
}
