package rhsu.board.test;

import rhsu.board.implementations.math.IntPiece;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.implementations.*;
import rhsu.board.implementations.math.*;
import rhsu.*;
import rhsu.board.implementations.math.IntBoard;

/**
 *
 */
public class Main 
{
	public static void main(String[] args)
	{
		//BoardReaderGeneric<IntPiece> test = new BoardReaderGeneric<>();
		BoardReaderOld test = new BoardReaderOld();
		test.mainPrompt();
	}
}
