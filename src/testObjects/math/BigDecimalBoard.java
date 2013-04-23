package testObjects.math;

import board.AbstractBoard;
import java.math.BigDecimal;

/**
 *
 */
public class BigDecimalBoard extends AbstractBoard<BigDecimalPiece>
{
	public BigDecimalBoard(int h, int v)
	{
		super(h, v);
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BigDecimalPiece(i, j, BigDecimal.ZERO);
			}
		}
	}
}
