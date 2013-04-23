package testObjects.math;

import board.AbstractPiece;
import java.math.BigInteger;

/**
 *
 */
public class BigIntegerPiece extends AbstractPiece
{
	public BigIntegerPiece(int h, int v, BigInteger bi)
	{
		super(h, v);
		this.t = bi;
	}
}
