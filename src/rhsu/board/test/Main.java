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
		//DoubleBoard b = new DoubleBoard(1,1);
		
		//double d1 = (double) b.getTypeAt(0, 0);
		
		//double d2 = (double) b.pieceAt(0, 0).getType();
		
		DoublePiece test = new DoublePiece(1,1,1);
		
		Double d3 = test.getType();
		
		IntegerPiece test2 = new IntegerPiece(1,1,1);
		
		Integer t2 = test2.getType();
		
		System.out.println(d3 + t2);
	}
}
