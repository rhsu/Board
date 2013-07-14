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
		BoardReader reader = new BoardReader();
		reader.mainPrompt();
		
		StringBoard test = reader.getOutputBoard();
		
		System.out.println(test);
		
		IntegerBoard b = new IntegerBoard(test);
		
		//System.out.println(b);
	}
}
