package rhsu.board.test;

import rhsu.board.Board;
import rhsu.board.BoardPiece;
import rhsu.board.Direction;
import rhsu.board.io.formGUI.BoardPanelGUIExtender;
import rhsu.board.basic.implementations.StringBoard;
import rhsu.terminalPanelGUI.UniversalPanelLauncher;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.resources.ResourceRetriever;

public class Main
{	
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{
		Board<Integer> testBoard = new IntegerBoard(
			ResourceRetriever.GetResource("Test127", TEST_RESOURCE));
		
		print(testBoard);
		
		print(testBoard.getValueAt(2,2));
		
		//assertEquals((int)testBoard.getValueAt(2, 2, Direction.LEFT, 1), 2);
		//assertEquals((int)testBoard.getValueAt(2, 2, Direction.LEFT, 2), -2);
		
		print(testBoard.getPieceAt(2, 2, Direction.LEFT, 2));
	}
}
