package rhsu.board.implementations.math;

import rhsu.board.AbstractPiece;

/**
 *A double implementation
 */
public class DoublePiece extends AbstractPiece<Double>
{
	public DoublePiece(int i, int j, double d)
	{
		super(i, j);
		this.t = d;
	}
}
