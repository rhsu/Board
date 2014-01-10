package rhsu.board.test;

import rhsu.board.mobility.implementation.BasicMobilityBoard;
import rhsu.board.mobility.MobilityBoard;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board.xc.GSNode;
import rhsu.board.xc.LinkedGStruct;

/**
 *
 * @author rhsu
 */
public class MockFactory 
{
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
	
	public static MobilityBoard<Integer> mockMobilityBoard()
	{
		return new BasicMobilityBoard<>(5,5,-1);
	}
}
