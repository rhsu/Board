package rhsu.board.implementations;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board.test.MockFactory;

/**
 *
 * @author rhsu
 */
public class BooleanBoardTest 
{
	BooleanBoard mockBoard = MockFactory.mockBooleanBoard();
	
    public BooleanBoardTest() 
	{
    }

	@Test
	public void test()
	{
		BooleanBoard testBoard = new BooleanBoard(ResourceRetriever.GetResource("test.txt"));
		assertEquals(testBoard, mockBoard);
	}
}