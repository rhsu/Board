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
		for(int i = 0; i < 5; i++)
		{
			print(new BooleanRandomGenerator().getRandom());
		}
	}
}
