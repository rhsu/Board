package sampleImplementations;

import board.AbstractPiece;

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
