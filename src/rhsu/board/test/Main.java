package rhsu.board.test;

import rhsu.board.arithmetic.Matrix;
import rhsu.board.implementations.math.IntegerBoard;

public class Main
{
	public static void main(String[] args)
	{
		Matrix b = new IntegerBoard(3,2);
		b.setTypeAt(0, 1, 5);
		b.setTypeAt(1, 0, 5);
		
		Matrix a = new IntegerBoard(2,2);
		a.setTypeAt(0, 1, 50);
		a.setTypeAt(1, 0, 50);
		
		System.out.println(b);
		System.out.println(a);
		
		Matrix c = a.Add(b);
		
		System.out.println(c);
	}
}
