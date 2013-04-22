package testObjects;

import board.AbstractPiece;

public class StringPiece extends AbstractPiece<String>
{
	public StringPiece(int i, int j, String s)
	{
		super(i, j);
		t = s;
	}
}
