package rhsu.board.implementations;

import rhsu.board.AbstractBoard;
import rhsu.board.Board;

/**
 *A boolean implementation
 */
public class BooleanBoard extends AbstractBoard<BooleanPiece>
{
	public BooleanBoard(int h, int v)
	{
		super(h, v);
		board = new BooleanPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BooleanPiece(i, j, false);
			}
		}
	}

	@Override
	public Board<BooleanPiece> ConvertFromStringBoard(StringBoard baseBoard) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
