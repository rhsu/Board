package rhsu.board;

import java.util.Iterator;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.resourceRetriever.ResourceRetrieverImpl;

@Ignore
public class TestUUID
{
	@Test
	public void testResourceBoardUUID()
	{
		//Just to make things compile. I don't expect this to work anymore
		Board<Integer> intBoard = new IntegerBoard(
			ResourceRetrieverImpl.getResourceRetriever("ExampleIntegerBoard", "ExampleIntegerBoard")
			.getReader());
			
		assertNotNull(intBoard.getUUID());
		
		Iterator<BoardPiece<Integer>> iterator = intBoard.iterBoard();
		
		while(iterator.hasNext())
		{
			BoardPiece<Integer> piece = iterator.next();
			
			//Test that a UUID exists 
			assertNotNull(piece.getUUID());
			
			//Test that the UUID is correct.
			assertEquals(piece.getUUID(), intBoard.getUUID());
		}
	}
	
	@Test public void foreignPiece_Fail()
	{
		Board<Integer> board1 = new IntegerBoard(3,3);
		Board<Integer> board2 = new IntegerBoard(3,3);
		
		assertFalse(board1.move(board2.getPieceAt(0,0), 0, 0, board2));
	}
}
