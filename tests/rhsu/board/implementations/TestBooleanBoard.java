package rhsu.board.implementations;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import rhsu.board.resources.ResourceRetriever;

public class TestBooleanBoard 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String testResource = "/rhsu/board/resources/test/";
	//</editor-fold>	
	
	@Test
	public void testResourceRetriever()
	{
		BooleanBoard testBoard = new BooleanBoard(ResourceRetriever.GetResource("testBooleanBoard", testResource));
		assertEquals(testBoard, new BooleanBoard(2,2));
	}
}
