package rhsu.board2;

import rhsu.board2.basic.BoardPieceImpl;
import rhsu.board2.basic.implementations.arithmetic.IntegerBoard2;
import rhsu.board2.factory.BoardFactory;

public class Debugger
{
	public static void main(String[] args)
	{
		BoardFactory<IntegerBoard2> factory = BoardFactory.createFactory(IntegerBoard2.class, 5, 5);
		IntegerBoard2 result = factory.createBoard();
		
		for (BoardPieceImpl<Integer>[] boardArray : result.getBoardArray())
		{
			for (BoardPieceImpl<Integer> boardPiece : boardArray)
			{
				System.out.println(boardPiece.getValue());
			}
		}
	}
}
