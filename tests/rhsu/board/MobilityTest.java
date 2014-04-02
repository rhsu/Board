package rhsu.board;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board.test.MockFactory;

public class MobilityTest 
{
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	private static final Board<Integer> source = new IntegerBoard(
		ResourceRetriever.GetResource("testMoveBoardSource", TEST_RESOURCE));
		
	private static final Board<Integer> destination = new IntegerBoard(
		ResourceRetriever.GetResource("testMoveBoardDestination",TEST_RESOURCE));
	
	@Test
	public void test()
	{
		//test that the move is successful
		assertTrue(source.move(source.getPieceAt(0,0), 0, 0, destination));
		
		assertEquals((int)source.getValueAt(0,0), 0);
		assertEquals((int)destination.getValueAt(0, 0), 1);
	}
}
