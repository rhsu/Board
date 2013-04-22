package testObjects;

import board.AbstractPiece;

public class IntPiece extends AbstractPiece<Integer>
{
	public IntPiece(int i, int j, int value)
	{
		super(i, j);
		t = new Integer(value);
	}
}
