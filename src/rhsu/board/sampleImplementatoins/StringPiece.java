package rhsu.board.sampleImplementatoins;

import rhsu.board.AbstractPiece;

/**
 * A string implementation
 */
public class StringPiece extends AbstractPiece<String>
{
	public StringPiece(int i, int j, String s)
	{
		super(i, j);
		t = s;
	}
}
