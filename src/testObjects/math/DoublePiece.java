package testObjects.math;

import board.AbstractPiece;

public class DoublePiece extends AbstractPiece
{
	public DoublePiece(int i, int j, double d)
	{
		super(i, j);
		this.t = d;
	}
}
