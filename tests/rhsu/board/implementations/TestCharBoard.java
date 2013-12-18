package rhsu.board.implementations;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import rhsu.board.resources.ResourceRetriever;

public class TestCharBoard 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String testResource = "/rhsu/board/resources/test/";
	//</editor-fold>
	
	@Test
	public void testResourceRetriever()
	{
		CharBoard testBoard = new CharBoard(
				ResourceRetriever.GetResource("testCharBoard", testResource));
		assertEquals(testBoard, new CharBoard(2,2));
	}
}
