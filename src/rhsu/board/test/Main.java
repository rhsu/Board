package rhsu.board.test;

import rhsu.board.sampleImplementations.math.IntegerPiece;
import rhsu.board.sampleImplementations.math.IntegerBoard;
import rhsu.board.AbstractBoard;
import rhsu.board.IO.BoardWriter;
import java.util.StringTokenizer;
import rhsu.board.*;
import rhsu.*;

/**
 *
 */
public class Main 
{
	public static void main(String[] args)
	{
		AbstractBoard board = new IntegerBoard(5,9);
		
		BoardWriter myWriter = new BoardWriter();
		
		myWriter.writeToFile(board, "something.txt");
	}
}
