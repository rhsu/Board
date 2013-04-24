package sampleImplementations.math;

import board.AbstractPiece;

/**
 *A double implementation
 */
public class DoublePiece extends AbstractPiece
{
	public DoublePiece(int i, int j, double d)
	{
		super(i, j);
		this.t = d;
	}
}
