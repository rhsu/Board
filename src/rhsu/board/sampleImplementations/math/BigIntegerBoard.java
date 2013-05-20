package rhsu.board.sampleImplementations.math;

import rhsu.board.AbstractBoard;
import java.math.BigInteger;

/**
 *A big integer implementation
 */
public class BigIntegerBoard extends AbstractBoard<BigIntegerPiece>
{
	public BigIntegerBoard(int h, int v)
	{
		super(h, v);
		board = new BigIntegerPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BigIntegerPiece(i, j, BigInteger.ZERO);
			}
		}
	}
}
