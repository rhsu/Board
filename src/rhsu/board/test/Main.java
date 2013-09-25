package rhsu.board.test;

import rhsu.board.implementations.arithmetic.IntegerBoard;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.*;
import rhsu.board.implementations.*;
import rhsu.board.implementations.gameObjects.Drop7Board;
import rhsu.board.implementations.gameObjects.Drop7Piece;
import rhsu.board.utilities.UtilityFunctions;

public class Main
{
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{
		IntegerBoard test = new IntegerBoard("test.txt");
		Integer t = test.determinant();
		
		print(t);
	}
}
