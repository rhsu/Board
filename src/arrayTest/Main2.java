package arrayTest;

import java.util.Arrays;
import rhsu.board2.Board2;
import rhsu.board2.basic.implementations.arithmetic.IntegerBoard2;

public class Main2
{
	public static void main(String[] args)
	{
		BoardFactory boardFactory = new BoardFactory(IntegerBoard2.class, 10, 10);
		
		Board2 b1 = boardFactory.createBoard();
		Board2 b2 = boardFactory.createBoard();
		
		boolean b = b1.equals(b2);
		
		System.out.println(b1.getBoardArray());
		System.out.println(b2.getBoardArray());
		
		System.out.println(b);
	}
}
