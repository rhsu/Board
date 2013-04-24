package testObjects.math;

import board.AbstractBoard;

/**
 *
 */
public class DoubleBoard extends AbstractBoard<DoublePiece>
{
	public DoubleBoard(int h, int v)
	{
		super(h, v);
		board = new DoublePiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new DoublePiece(i, j, 0.0);
			}
		}
	}
}
