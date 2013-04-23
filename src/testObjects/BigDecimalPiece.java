package testObjects;

import board.AbstractPiece;
import java.math.BigDecimal;

/**
 *
 */
public class BigDecimalPiece extends AbstractPiece
{
	public BigDecimalPiece(int h, int j, BigDecimal bd)
	{
		super(h, j);
		t = bd;
	}
}
