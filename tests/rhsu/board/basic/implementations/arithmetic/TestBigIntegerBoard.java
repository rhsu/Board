package rhsu.board.basic.implementations.arithmetic;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.resources.ResourceRetriever;

public class TestBigIntegerBoard 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String testResource = "/rhsu/board/resources/test/";
	//</editor-fold>
	
	@Test
	public void testResourceRetriever()
	{
		BigIntegerBoard testBoard = new BigIntegerBoard(
				ResourceRetriever.GetResource("testZeroBoard", testResource));
		assertEquals(testBoard.toString(), new BigIntegerBoard(2,2).toString());
	}
	
	//<editor-fold desc="Unit Tests for Equals" defaultstate="collapsed">
	
	@Test
	public void testEqeualsSelf()
	{
		
	}
	
	@Test
	public void testNotEqualsNull()
	{
		
	}
	
	@Test
	public void testEquals()
	{
		
	}
	
	@Test
	public void testNotEquals()
	{
		
	}
	
	//</editor-fold>
	
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
