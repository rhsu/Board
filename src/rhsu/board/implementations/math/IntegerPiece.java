package rhsu.board.implementations.math;

import rhsu.board.AbstractPiece;

/**
 * An integer implementation
 */
public class IntegerPiece extends AbstractPiece<Integer>
{
	public IntegerPiece(int i, int j, int value)
	{
		super(i, j);
		t = new Integer(value);
	}
}
