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
		
		System.out.println(test);
		
		BoardPiece<Integer> testPiece = test.getPieceAt(2, 2);
		
		//UP
		System.out.println(testPiece);
		
		//DOWN
		
		//LEFT
		
		//RIGHT
	}
}
