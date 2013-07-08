package rhsu.board.sampleImplementations.math;

import rhsu.board.BaseBoard;
import rhsu.board.BaseBoard;

/**
 * An integer implementation
 */
//public class IntBoard extends AbstractBoard<IntPiece>
public class IntBoard extends BaseBoard<IntPiece>
{
	public IntBoard(int h, int v)
	{
		super(h, v);
		board = new IntPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new IntPiece(i, j, 0);
			}
		}
	}
}