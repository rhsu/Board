package rhsu.board.implementations.arithmetic;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.resources.ResourceRetriever;

public class TestIntegerBoard 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String testResource = "/rhsu/board/resources/test/";
	//</editor-fold>
	
	@Test
	public void testResourceRetriever()
	{
		IntegerBoard testBoard = new IntegerBoard(
				ResourceRetriever.GetResource("testZeroBoard", testResource));
		assertEquals(testBoard.toString(), new IntegerBoard(2,2).toString());
	}
	
	@Test
	public void testAdd()
	{
		
	}
		
	@Test
	public void testSubtract()
	{
		
	}
	
	@Test
	public void testMultiply()
	{
		
	}
	
	@Test
	public void testMultiplyScalar()
	{
		
	}
}
