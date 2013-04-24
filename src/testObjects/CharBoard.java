/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testObjects;

import board.AbstractBoard;

/**
 *
 */
public class CharBoard extends AbstractBoard<CharPiece>
{
	public CharBoard(int h, int v)
	{
		super(h, v);
		board = new CharPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new CharPiece(i, j, ' ');
			}
		}
	}
}
