package sampleImplementations.math;

import board.AbstractBoard;

/**
 * An integer implementation
 */
public class IntBoard extends AbstractBoard<IntPiece>
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

	public int getHorizontal() 
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public int getVertical() 
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}
}