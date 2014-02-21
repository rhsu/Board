package rhsu.board;

import static org.junit.Assert.*;
import org.junit.*;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.resources.ResourceRetriever;

public class TestIssue127 
{
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	@Test
	public void test_GetValueAt()
	{
		Board<Integer> testBoard = new IntegerBoard(
			ResourceRetriever.GetResource("Test127", TEST_RESOURCE));
		
		//UP
		assertEquals((int)testBoard.getValueAt(2, 2, Direction.UP, 1), 1);
		assertEquals((int)testBoard.getValueAt(2, 2, Direction.UP, 2), -1);
		
		//DOWN
		assertEquals((int)testBoard.getValueAt(2, 2, Direction.DOWN, 1), 4);
		assertEquals((int)testBoard.getValueAt(2, 2, Direction.DOWN, 2), -4);
		
		//LEFT
		assertEquals((int)testBoard.getValueAt(2, 2, Direction.LEFT, 1), 2);
		assertEquals((int)testBoard.getValueAt(2, 2, Direction.LEFT, 2), -2);
		
		//RIGHT
		assertEquals((int)testBoard.getValueAt(2, 2, Direction.RIGHT, 1), 3);
		assertEquals((int)testBoard.getValueAt(2, 2, Direction.RIGHT, 2), -3);
	}
}
