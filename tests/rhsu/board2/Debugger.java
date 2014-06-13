package rhsu.board2;

import rhsu.board2.basic.BoardPieceImpl;
import rhsu.board2.basic.implementations.arithmetic.DoubleBoard2;
import rhsu.board2.basic.implementations.arithmetic.IntegerBoard2;
import rhsu.board2.factory.BoardFactory;

public class Debugger
{
	public static void main(String[] args)
	{
		BoardFactory<DoubleBoard2> factory = BoardFactory.createFactory(DoubleBoard2.class, 5, 5);
		DoubleBoard2 result = factory.createBoard();
		
		for (BoardPieceImpl<Double>[] boardArray : result.getBoardArray())
		{
			for (BoardPieceImpl<Double> boardPiece : boardArray)
			{
				System.out.println(boardPiece.getValue());
			}
		}
	}
}
