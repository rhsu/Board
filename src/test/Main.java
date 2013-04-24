package test;

import testObjects.math.IntBoard;
import board.AbstractBoard;
import testObjects.*;
import testObjects.math.*;

/**
 *
 */
public class Main 
{
	public static void main(String[] args)
	{
		//BigDecimalBoard board = new BigDecimalBoard(5, 5);
		//System.out.println(board);
		//BigIntegerBoard board = new BigIntegerBoard(10,10);
		
		IntBoard board = new IntBoard(5,9);
		//StringBoard board = new StringBoard(3,3);
		//CharBoard board = new CharBoard(3,3);
		//System.out.println(board.pieceAt(,));
		//IntPiece p = new IntPiece(3,3,1);
		//System.out.println(p);
		IntPiece p = board.pieceAt(1,1);
		System.out.println(p);
		System.out.println(board);
	}
}
