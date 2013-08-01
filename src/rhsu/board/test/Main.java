package rhsu.board.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import rhsu.board.AbstractBoard;
import rhsu.board.Board;
import rhsu.board.BoardPiece;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;
import rhsu.board.reflection.ReflectionBoard;

public class Main
{
	public static void main(String[] args)
	{
		/*CharBoard b = new CharBoard("test.txt");
		
		System.out.println(b);*/
		
		ReflectionBoard<String> myStuff = new ReflectionBoard<>(String.class, 10, 10);
		
		myStuff.setTypeAt(0, 0, "abcdefg");
		
		System.out.println(myStuff.getTypeAt(0, 0));
	}
}
