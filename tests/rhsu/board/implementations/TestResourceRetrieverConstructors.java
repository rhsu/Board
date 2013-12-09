package rhsu.board.implementations;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.resources.ResourceRetriever;

/**
 *
 * @author rhsu
 */
public class TestResourceRetrieverConstructors 
{
	private static final String testResource = "/rhsu/board/resources/test/";
	
	@Test
	public void testBooleanBoard()
	{
		BooleanBoard testBoard = new BooleanBoard(ResourceRetriever.GetResource("testBooleanBoard", testResource));
		assertEquals(testBoard.toString(), new BooleanBoard(2,2).toString());
	}
	
	@Test
	public void testCharBoard()
	{
		CharBoard testBoard = new CharBoard(ResourceRetriever.GetResource("testCharBoard", testResource));
		assertEquals(testBoard.toString(), new CharBoard(2,2).toString());
	}
}