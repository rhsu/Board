package rhsu.board.test;

import rhsu.board.IO.formGUI.BoardPanelGUIExtender;
import rhsu.board.implementations.basic.StringBoard;
import rhsu.terminalPanelGUI.UniversalPanelLauncher;

public class Main
{	
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
