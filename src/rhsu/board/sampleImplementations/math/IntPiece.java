package rhsu.board.sampleImplementations.math;

import rhsu.board.AbstractPiece;

/**
 * An integer implementation
 */
public class IntPiece extends AbstractPiece<Integer>
{
	public IntPiece(int i, int j, int value)
	{
		super(i, j);
		t = new Integer(value);
	}
}
