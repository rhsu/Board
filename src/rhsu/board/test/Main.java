package rhsu.board.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import rhsu.board.AbstractBoard;
import rhsu.board.Board;
import rhsu.board.BoardPiece;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.implementations.math.BigIntegerBoard;
import rhsu.board.implementations.math.DoubleBoard;
import rhsu.board.implementations.math.IntegerBoard;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;

public class Main
{
	public static void main(String[] args)
	{
		CharBoard b = new CharBoard("test.txt");		
		System.out.println(b);
	}
}
