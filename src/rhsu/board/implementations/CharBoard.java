package rhsu.board.implementations;

import rhsu.board.AbstractBoard;
import rhsu.board.Board;

/**
 *A character implementation
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

	@Override
	public Board<CharPiece> ConvertFromStringBoard(StringBoard baseBoard) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
