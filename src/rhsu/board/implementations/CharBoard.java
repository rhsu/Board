package rhsu.board.implementations;

import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;

/**
 *A character implementation
 */
public class CharBoard extends AbstractBoard<Character>
{
	@SuppressWarnings({"unchecked"})
	public CharBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, ' ');
			}
		}
	}

	@SuppressWarnings({"unchecked"})
	public CharBoard(String filename)
	{
		super(filename);

		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				board[i][j] = new BoardPiece(i, j, 
						baseBoard.getTypeAt(i, j).charAt(0));
			}
		}
	}
}
