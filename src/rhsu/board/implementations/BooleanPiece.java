package rhsu.board.implementations;

import rhsu.board.BasePiece;

/**
 *A boolean implementation
 */
public class BooleanPiece extends BasePiece
{
	public BooleanPiece(int i, int j, boolean b)
	{
		super(i, j);
		this.t = b;
	}
}
