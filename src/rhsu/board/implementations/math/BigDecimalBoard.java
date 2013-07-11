package rhsu.board.implementations.math;

import rhsu.board.BaseBoard;
import java.math.BigDecimal;

/**
 *A big decimal implementation
 */
public class BigDecimalBoard extends BaseBoard<BigDecimalPiece>
{
	public BigDecimalBoard(int h, int v)
	{
		super(h, v);
		board = new BigDecimalPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BigDecimalPiece(i, j, BigDecimal.ZERO);
			}
		}
	}
}
