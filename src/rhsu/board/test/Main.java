package rhsu.board.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.*;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;
import rhsu.board.testObjects.gameObjects.overhaul.Drop7Board;
import rhsu.board.testObjects.gameObjects.overhaul.Drop7Piece;

public class Main
{
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{
		Drop7Board board = new Drop7Board(5,5);
		
		board.setValueAt(0, 0, Drop7Piece.SET);
		board.setValueAt(0, 1, Drop7Piece.SET);
		board.setValueAt(1, 0, Drop7Piece.SET);
		
		print(board);
		
		print("testing getColumnAdjacent functions...");
		
		BoardPiece<Drop7Piece> test = board.pieceAt(0, 0);
		
		print(test);
		
		int i = board.getNumberRowAdjacent(test);
		print(i);
	}
}
