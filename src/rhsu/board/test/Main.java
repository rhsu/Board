package rhsu.board.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.IO.formGUI.*;
import rhsu.board.arithmetic.*;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;
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
