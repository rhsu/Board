package rhsu.board.sampleImplementatoins;

import rhsu.board.AbstractPiece;

/**
 *A boolean implementation
 */
public class BooleanPiece extends AbstractPiece
{
	public BooleanPiece(int i, int j, boolean b)
	{
		super(i, j);
		this.t = b;
	}
}
