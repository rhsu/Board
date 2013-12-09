package rhsu.board.implementations.arithmetic;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.resources.ResourceRetriever;

/**
 *
 * @author rhsu
 */
public class TestResourceRetrieverArithmetic 
{
	private static final String testResource = "/rhsu/board/resources/test/";
	
	@Test
	public void testBigDoubleBoard()
	{
		DoubleBoard testBoard = new DoubleBoard(ResourceRetriever.GetResource("testZeroBoard", testResource));
		assertEquals(testBoard.toString(), new DoubleBoard(2,2).toString());
	}
	
	@Test
	public void testBigIntegerBoard()
	{
		fail("fail not implemented yet");
	}
	
	@Test
	public void testDoubleBoard()
	{
		fail("Not implemented yet");
	}
	
	@Test
	public void testIntegerBoard()
	{
		fail("Not implemented yet");
	}
}
