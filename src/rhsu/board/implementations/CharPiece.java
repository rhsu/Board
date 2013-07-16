package rhsu.board.implementations;

import rhsu.board.AbstractPiece;

/**
 *A character implementation
 */
public class CharPiece extends AbstractPiece<Character>
{
	public CharPiece(int i, int j, char c)
	{
		super(i, j);
		this.t = c;
	}
}
