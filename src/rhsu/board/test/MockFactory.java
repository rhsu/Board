package rhsu.board.test;

import rhsu.board.Board;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.xc.GSNode;
import rhsu.board.xc.LinkedGStruct;

/**
 *
 * @author rhsu
 */
public class MockFactory 
{
	public static Board<Integer> mockBoard()
	{
		return new IntegerBoard(5,5);
	}
	
	public static BasicBoardPiece<Integer> mockBoardPiece()
	{
		return new BasicBoardPiece<>(-1, -1, 5);
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
