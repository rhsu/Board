package testObjects;

import board.AbstractBoard;

public class IntBoard extends AbstractBoard<IntPiece>
{
	public IntBoard(int h, int v)
	{
		super(h, v);
		for(int i = 0; i < 7; i++)
		{
			for(int j = 0; j < 7; j++)
			{
				board[i][j] = new IntPiece(i, j, 0);
			}
		}
	}
}