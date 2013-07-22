package rhsu.board.implementations;

import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;

/**
 * A string implementation
 */
public class StringBoard extends AbstractBoard<String>
{
	@SuppressWarnings({"unchecked"})
	public StringBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{			
				board[i][j] = new BoardPiece(i, j, "");
			}
		}
	}
	
	/*public StringBoard(StringBoard copy)
	{
		super(copy);
	}*/
	
	public void convertFromStringBoard(StringBoard baseBoard) 
	{
		//return baseBoard;
	}
}
