package rhsu.board.test;

import rhsu.board.Board;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;

public class Main
{
	public static void main(String[] args)
	{
		/*Matrix b = new DoubleBoard(2,2);
		b.setTypeAt(0, 1, 5.6);
		b.setTypeAt(1, 0, 5.8);
		
		Matrix a = new DoubleBoard(2,2);
		a.setTypeAt(0, 1, 50.0);
		a.setTypeAt(1, 0, 50.0);
		
		System.out.println(b);
		System.out.println(a);
		
		Matrix c = a.Add(b);
		
		System.out.println(c);*/
		
		BoardReader reader = new BoardReader();
		reader.mainPrompt();
		
		IntegerBoard b = new IntegerBoard(1,1);

		Board<IntegerPiece> test = b.ConvertFromStringBoard(reader.getOutputBoard());
		
		System.out.println(test);
	}
}
