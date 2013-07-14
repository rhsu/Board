package rhsu.board.implementations;

import rhsu.board.AbstractBoard;
import rhsu.board.Board;

/**
 * A string implementation
 */
public class StringBoard extends AbstractBoard<StringPiece>
{
	public StringBoard(int h, int v)
	{
		super(h, v);
		board = new StringPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{			
				board[i][j] = new StringPiece(i, j, "");
			}
		}
	}

	@Override
	public void ConvertFromStringBoard(StringBoard baseBoard) 
	{
		//return baseBoard;
	}
}
