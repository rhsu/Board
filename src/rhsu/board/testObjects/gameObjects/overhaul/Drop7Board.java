package rhsu.board.testObjects.gameObjects.overhaul;

import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;

/**
 *
 * @author rhsu
 */
public class Drop7Board extends AbstractBoard<Drop7PieceType>
{
	public Drop7Board(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, Drop7PieceType.EMPTY);
			}
		}
	}
}
