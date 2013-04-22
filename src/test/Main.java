package test;

import testObjects.StringBoard;

/**
 *
 */
public class Main 
{
	public static void main(String[] args)
	{
		StringBoard board = new StringBoard();
		board.pieceAt(1, 2).setType("abcdefg");
		System.out.println(board);
	}
}
