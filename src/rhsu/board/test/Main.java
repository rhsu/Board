package rhsu.board.test;

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
		IntegerBoard b = new IntegerBoard(5,5);
		
		b.setTypeAt(0, 0, 29);
		b.setTypeAt(0, 1, 66);
		
		BoardPiece<Integer> test = b.pieceAt(0, 0);
		
		System.out.println(b);
		
		System.out.println(b.getRightPiece(0,0));
		System.out.println(b.getRightPiece(test));
		//System.out.println(test);
	}
}
