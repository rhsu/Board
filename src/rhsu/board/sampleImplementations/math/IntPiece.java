package rhsu.board.sampleImplementations.math;

import rhsu.board.AbstractPiece;
import rhsu.board.BasePiece;

/**
 * An integer implementation
 */
public class IntPiece extends BasePiece<Integer>
{
	public IntPiece(int i, int j, int value)
	{
		super(i, j);
		t = new Integer(value);
	}
}
