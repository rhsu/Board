package rhsu.board;

import java.util.Iterator;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.resources.ResourceRetriever;

public class TestUUID
{
	@Test
	public void testResourceBoardUUID()
	{
		Board<Integer> intBoard = new IntegerBoard(ResourceRetriever.GetResource("ExampleIntegerBoard"));
		
		assertNotNull(intBoard.getUUID());
		
		Iterator<BoardPiece<Integer>> iterator = intBoard.iterBoard();
		
		while(iterator.hasNext())
		{
			BoardPiece<Integer> piece = iterator.next();
			assertNotNull(piece.getUUID());
			assertEquals(piece.getUUID(), intBoard.getUUID());
		}
	}
}
