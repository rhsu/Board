package rhsu.board.test;

import rhsu.board.AbstractBoard;
import rhsu.board.Board;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;

public class Main
{
	public static void main(String[] args)
	{
		/*BoardReader reader = new BoardReader();
		reader.mainPrompt();
		StringBoard test = reader.getOutputBoard();
		
		System.out.println(test);
		
		IntegerBoard b = new IntegerBoard(1,1);
		
		b = (IntegerBoard) b.ConvertFromStringBoard(test);
		
		System.out.println(b);*/
		
		BooleanBoard b = new BooleanBoard(1,2);
		b.setTypeAt(0, 0, true);
		
		System.out.println(b);
		
		//System.out.println(b.getTypeAt(0,0));
		
		BooleanBoard c = new BooleanBoard(b);
		
		System.out.println(c);
	}
}
