package rhsu.board.test;

import rhsu.board.BoardPiece;
import rhsu.board.IO.formGUI.BoardPanelGUIExtender;
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
		IntegerBoard test = new IntegerBoard(5,5, 3);
		test.setValueAt(0, 0, -99);
		test.setValueAt(1, 1, 2);
		print(test);
		print("+++++++++++");
		BoardPiece<Integer> zero = test.pieceAt(0, 0);
		
		test.move(test.pieceAt(0, 0), 1, 1);
		
		print(test);
	}
}
