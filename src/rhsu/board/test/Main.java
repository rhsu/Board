package rhsu.board.test;

import java.util.HashSet;
import rhsu.board.AbstractBoard;
import rhsu.board.Board;
import rhsu.board.BoardPiece;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;

public class Main
{
	public static void main(String[] args)
	{
		BigIntegerBoard b = new BigIntegerBoard("test.txt");
		
		System.out.println(b);
	}
}
