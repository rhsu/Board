package test;

import testObjects.StringBoard;

/**
 *
 */
public class Main 
{
	public static void main(String[] args)
	{
		StringBoard board = new StringBoard(5, 6);
		board.pieceAt(1, 2).setType("abcdefg");
		System.out.println(board);
	}
}
