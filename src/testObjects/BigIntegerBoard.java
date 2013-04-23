package testObjects;

import board.AbstractBoard;
import java.math.BigInteger;

/**
 *
 */
public class BigIntegerBoard extends AbstractBoard<BigIntegerPiece>
{
	public BigIntegerBoard(int h, int v)
	{
		super(h, v);
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BigIntegerPiece(i, j, BigInteger.ZERO);
			}
		}
	}
}
