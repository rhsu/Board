package rhsu.board.implementations.math;

import rhsu.board.BasePiece;

/**
 *A double implementation
 */
public class DoublePiece extends BasePiece
{
	public DoublePiece(int i, int j, double d)
	{
		super(i, j);
		this.t = d;
	}
}
