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
		Board<Integer> test = new IntegerBoard(
			ResourceRetriever.GetResource("Test127", TEST_RESOURCE));
		
		//UP
		assertEquals((int)test.getValueAt(2, 2, Direction.UP, 0), 1);
		
		//DOWN
		assertEquals((int)test.getValueAt(2, 2, Direction.DOWN, 0), 4);
		
		//LEFT
		assertEquals((int)test.getValueAt(2, 2, Direction.LEFT, 0), 2);
		
		//RIGHT
		assertEquals((int)test.getValueAt(2, 2, Direction.RIGHT, 0), 3);
	}
}
