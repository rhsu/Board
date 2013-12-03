package rhsu.board.xc;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.BoardPiece;

/**
 *
 * @author rhsu
 */
public class LinkedGStructTest 
{
	static LinkedGStruct<Integer> mockLinkedGStruct;
	static BoardPiece<Integer> mockBoardPiece;
	
	@BeforeClass
	public static void setUpClass()
	{
		mockLinkedGStruct = new LinkedGStruct<>();
		mockBoardPiece = new BoardPiece<>(-1, -1, 5);
	}
	
	@Test
	public void testInsert()
	{
		mockLinkedGStruct.insert(mockBoardPiece);
	}
}
