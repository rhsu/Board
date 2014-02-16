package rhsu.board;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.resources.ResourceRetriever;

/**
 * 
 */
public class TestIssue110 
{
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	@Test
	public void testMoveUnits()
	{
		Board<Integer> test = new IntegerBoard(
			ResourceRetriever.GetResource("Test127", TEST_RESOURCE));
		
// 0 0 -1 0 0
// 0 0 1 0 0
// -2 2 9 3 -3
// 0 0 4 0 0
// 0 0 -4 0 0
		
		//BoardPiece<Integer> testPiece = test.getPieceAt(2, 2);
		
		assertEquals(-1, (int)test.getValueAt(2, 2, Direction.UP, 2));
		
		assertEquals(-4, (int)test.getValueAt(2, 2, Direction.DOWN, 2));
		
		assertEquals(-2, (int)test.getValueAt(2, 2, Direction.LEFT, 2));
		
		assertEquals(-3, (int)test.getValueAt(2, 2, Direction.RIGHT, 2));
	}
}
