package rhsu.board.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.*;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;
import rhsu.board.gameObjects.Drop7Board;
import rhsu.board.gameObjects.Drop7Piece;
import rhsu.board.utilities.UtilityFunctions;

public class Main
{
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{
		int i = UtilityFunctions.changeSign(25);
		print(i);
	}
}
