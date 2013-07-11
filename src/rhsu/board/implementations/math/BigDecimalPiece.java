package rhsu.board.implementations.math;

import rhsu.board.AbstractPiece;
import java.math.BigDecimal;

/**
 *A big decimal implementation
 */
public class BigDecimalPiece extends AbstractPiece
{
	public BigDecimalPiece(int h, int j, BigDecimal bd)
	{
		super(h, j);
		t = bd;
	}
}
