package rhsu.board.implementations;

import rhsu.board.BasePiece;

/**
 * A string implementation
 */
public class StringPiece extends BasePiece<String>
{
	public StringPiece(int i, int j, String s)
	{
		super(i, j);
		t = s;
	}
}
