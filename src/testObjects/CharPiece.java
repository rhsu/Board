/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testObjects;

import board.AbstractPiece;

/**
 *
 */
public class CharPiece extends AbstractPiece
{
	public CharPiece(int i, int j, char c)
	{
		super(i, j);
		this.t = c;
	}
}
