package rhsu.board.sampleImplementations.math;

import rhsu.board.BasePiece;
import java.math.BigDecimal;

/**
 *A big decimal implementation
 */
public class BigDecimalPiece extends BasePiece
{
	public BigDecimalPiece(int h, int j, BigDecimal bd)
	{
		super(h, j);
		t = bd;
	}
}
