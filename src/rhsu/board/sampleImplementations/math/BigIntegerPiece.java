package rhsu.board.sampleImplementations.math;

import rhsu.board.BasePiece;
import java.math.BigInteger;

/**
 *A big integer implementation
 */
public class BigIntegerPiece extends BasePiece
{
	public BigIntegerPiece(int h, int v, BigInteger bi)
	{
		super(h, v);
		this.t = bi;
	}
}
