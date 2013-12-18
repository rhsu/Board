package rhsu.board.implementations;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import rhsu.board.resources.ResourceRetriever;

public class TestStringBoard 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String testResource = "/rhsu/board/resources/test/";
	//</editor-fold>
	
	@Test
	public void testResourceRetriever()
	{
		StringBoard testBoard = new StringBoard(
				ResourceRetriever.GetResource("testStringBoard", testResource));
		assertEquals(testBoard, new StringBoard(2,2));
	}
}

