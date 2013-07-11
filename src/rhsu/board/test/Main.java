package rhsu.board.test;

import rhsu.board.IO.BoardWriter;
import java.util.StringTokenizer;
import rhsu.board.*;
import rhsu.*;
import rhsu.board.implementations.math.IntBoard;

/**
 *
 */
public class Main 
{
	public static void main(String[] args)
	{
		/*StringTokenizer st = new StringTokenizer("this, is, a, test",",|");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken().trim());
		}*/
		
		BaseBoard board = new IntBoard(5,9);
		
		//BoardWriter myWriter = new BoardWriter();
		
		//myWriter.writeToFile(board, "something.txt");
		
		BoardWriter myWriter = new BoardWriter(board);
	}
}
