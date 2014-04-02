package rhsu.board;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board.test.MockFactory;

public class MobilityTest 
{
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	private static Board<Integer> mockMoveBoard;
	private static BoardPiece<Integer> mockMovePiece;
	private static BoardPiece<Integer> mockMovePieceDestination;
	
	private static Board<Integer> mockMoveOtherBoard;
	private static BoardPiece<Integer> mockMoveOtherPiece;
	
	private static Board<Integer> testMoveDirectionBoard;
	
	@Test
	public void test()
	{
		
	}
}
