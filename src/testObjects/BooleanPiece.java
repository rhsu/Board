package testObjects;

import board.AbstractPiece;

/**
 *
 */
public class BooleanPiece extends AbstractPiece
{
	public BooleanPiece(int i, int j, boolean b)
	{
		super(i, j);
		this.t = b;
	}
}
