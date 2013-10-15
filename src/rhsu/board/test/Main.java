package rhsu.board.test;

import rhsu.board.implementations.arithmetic.IntegerBoard;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.*;
import rhsu.board.implementations.*;
import rhsu.board.implementations.gameObjects.Drop7Board;
import rhsu.board.implementations.gameObjects.Drop7Piece;
import rhsu.board.random.*;
import rhsu.board.utilities.UtilityFunctions;

public class Main
{
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{
<<<<<<< HEAD
		IntegerRandomGenerator test = new IntegerRandomGenerator(156);
		test.setLimit(10);
		
		for(int i = 0; i < 5; i++)
		{
			print(test.getRandom());
		}
=======
		IntegerBoard test = new IntegerBoard("test.txt");
		//Integer t = test.determinant();
		
		//IntegerBoard test = new IntegerBoard(3,3);
		
		/*Iterator t = test.iterBoard();
		int ctr = 0;
		while(t.hasNext())
		{
			BoardPiece<Integer> item = (BoardPiece<Integer>) t.next();
			print(ctr++ + " " + item);
		}*/
		
		print(test.findAll(1));
>>>>>>> dev
	}
}
