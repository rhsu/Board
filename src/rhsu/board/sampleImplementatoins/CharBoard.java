package rhsu.board.sampleImplementatoins;

import rhsu.board.AbstractBoard;

/**
 *A character implementation
 */
public class CharBoard extends AbstractBoard<CharPiece>
{
	public CharBoard(int h, int v)
	{
		super(h, v);
		board = new CharPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new CharPiece(i, j, ' ');
			}
		}
	}
}
