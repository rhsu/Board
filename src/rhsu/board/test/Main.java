package rhsu.board.test;

import rhsu.board.AbstractBoard;
import rhsu.board.Board;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.implementations.math.BigIntegerBoard;
import rhsu.board.implementations.math.DoubleBoard;
import rhsu.board.implementations.math.IntegerBoard;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;

public class Main
{
	public static void main(String[] args)
	{
		BoardReader reader = new BoardReader();
		reader.mainPrompt();
		StringBoard test = reader.getOutputBoard();
		
		IntegerBoard b = new IntegerBoard(1,1);
		b.ConvertFromStringBoard(test);
		
		System.out.println(b);
	}
}
