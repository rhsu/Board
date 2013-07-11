package rhsu.board.test;

import rhsu.board.arithmetic.Matrix;
import rhsu.board.implementations.math.BigIntegerBoard;
import rhsu.board.implementations.math.DoubleBoard;
import rhsu.board.implementations.math.IntegerBoard;

public class Main
{
	public static void main(String[] args)
	{
		BigIntegerBoard b = new BigIntegerBoard(2,2);
		b.setTypeAt(0, 1, 10);
		b.setTypeAt(1, 0, 10);
		
		BigIntegerBoard a = new BigIntegerBoard(2,2);
		a.setTypeAt(0, 1, 50);
		a.setTypeAt(1, 0, 50);
		
		System.out.println(b);
		System.out.println(a);
		
		BigIntegerBoard c = (BigIntegerBoard) a.Add(b);
		
		//System.out.println(c);
	}
}
