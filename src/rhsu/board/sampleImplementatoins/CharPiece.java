package rhsu.board.sampleImplementatoins;

import rhsu.board.BasePiece;

/**
 *A character implementation
 */
public class CharPiece extends BasePiece
{
	public CharPiece(int i, int j, char c)
	{
		super(i, j);
		this.t = c;
	}
}
