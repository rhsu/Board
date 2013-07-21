package rhsu.board.test;

import java.util.HashSet;
import rhsu.board.AbstractBoard;
import rhsu.board.Board;
import rhsu.board.BoardPiece;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;

public class Main
{
	public static void main(String[] args)
	{
		//BoardIOConsoleApp.LaunchApp();
		
		IntegerBoard b = new IntegerBoard(3,3);
		b.setTypeAt(0, 2, 2562);
		
		b.export("test.txt");
	}
}
