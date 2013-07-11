package rhsu.board.test;

import rhsu.board.sampleImplementations.math.IntPiece;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.sampleImplementations.*;
import rhsu.board.sampleImplementations.math.*;

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
