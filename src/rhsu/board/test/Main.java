package rhsu.board.test;

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
		StringBoard test = new StringBoard("test.txt");
		UniversalPanelLauncher.Launch(new BoardPanelGUIExtender(test));
	}
}
