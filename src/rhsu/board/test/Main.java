package rhsu.board.test;

import rhsu.board.implementations.arithmetic.IntegerBoard;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.IO.formGUI.*;
import rhsu.board.arithmetic.*;
import rhsu.board.implementations.*;
<<<<<<< HEAD
import rhsu.terminalPanelGUI.UniversalPanelLauncher;

=======
import rhsu.board.implementations.gameObjects.Drop7Board;
import rhsu.board.implementations.gameObjects.Drop7Piece;
import rhsu.board.utilities.UtilityFunctions;
>>>>>>> dev

public class Main
{
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
<<<<<<< HEAD
	{		
		StringBoard test = new StringBoard("test.txt");
		
		
		//print(test);
		UniversalPanelLauncher.Launch(new BoardPanelGUIExtender(test));
=======
	{
		IntegerBoard test = new IntegerBoard("test.txt");
		//Integer t = test.determinant();
		
		//IntegerBoard test = new IntegerBoard(3,3);
		
		/*Iterator t = test.iterBoard();
		int ctr = 0;
		while(t.hasNext())
		{
			BoardPiece<Integer> item = (BoardPiece<Integer>) t.next();
			print(ctr++ + " " + item);
		}*/
		
		print(test.findAll(1));
>>>>>>> dev
	}
}
