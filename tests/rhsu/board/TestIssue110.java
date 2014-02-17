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
	private static Board<Integer> testBoard;
	
	@Before
	public void setUpClass()
	{
		testBoard = new IntegerBoard(
			ResourceRetriever.GetResource("Test127", TEST_RESOURCE));
	}
	
	
	@Test
	public void testGet0Units()
	{
		assertEquals
		(
			testBoard.getPieceAt(2, 2),
			testBoard.getPieceAt(2, 2, Direction.DOWN, 0)
		);
	}
	
	@Test
	public void testGet2Units()
	{
		
// 0 0 -1 0 0
// 0 0 1 0 0
// -2 2 9 3 -3
// 0 0 4 0 0
// 0 0 -4 0 0
		
		//BoardPiece<Integer> testPiece = test.getPieceAt(2, 2);
		
		assertEquals(-1, (int)testBoard.getValueAt(2, 2, Direction.UP, 2));
		
		assertEquals(-4, (int)testBoard.getValueAt(2, 2, Direction.DOWN, 2));
		
		assertEquals(-2, (int)testBoard.getValueAt(2, 2, Direction.LEFT, 2));
		
		assertEquals(-3, (int)testBoard.getValueAt(2, 2, Direction.RIGHT, 2));
	}
}
