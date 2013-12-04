package rhsu.board.test;

import rhsu.board.BoardPiece;
import rhsu.board.xc.GSNode;
import rhsu.board.xc.LinkedGStruct;

/**
 *
 * @author rhsu
 */
public class MockFactory 
{
	public static BoardPiece<Integer> mockBoardPiece()
	{
		return new BoardPiece<>(-1, -1, 5);
	}
	
	public static LinkedGStruct<Integer> mockLinkedGStruct()
	{
		return new LinkedGStruct();
	}
	
	public static GSNode<Integer> mockGSNode()
	{
		return new GSNode<>(-1, -1, 5);
	}
}
