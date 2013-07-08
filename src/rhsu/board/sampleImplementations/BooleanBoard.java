package rhsu.board.sampleImplementations;

import rhsu.board.BaseBoard;

/**
 *A boolean implementation
 */
public class BooleanBoard extends BaseBoard<BooleanPiece>
{
	public BooleanBoard(int h, int v)
	{
		super(h, v);
		board = new BooleanPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BooleanPiece(i, j, false);
			}
		}
	}
}
