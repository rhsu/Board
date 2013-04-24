package sampleImplementations;

import board.AbstractPiece;

/**
 *A character implementation
 */
public class CharPiece extends AbstractPiece
{
	public CharPiece(int i, int j, char c)
	{
		super(i, j);
		this.t = c;
	}
}
