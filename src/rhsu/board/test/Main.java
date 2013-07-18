package rhsu.board.test;

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
		BoardReaderConsoleApp app = new BoardReaderConsoleApp();
		app.mainPrompt();
	}
}
