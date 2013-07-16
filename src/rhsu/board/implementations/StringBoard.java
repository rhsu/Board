package rhsu.board.implementations;

import rhsu.board.AbstractBoard;

/**
 * A string implementation
 */
public class StringBoard extends AbstractBoard<String>
{
	@SuppressWarnings({"unchecked"})
	public StringBoard(int h, int v)
	{
		super(h, v);
		board = new AbstractPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{			
				board[i][j] = new AbstractPiece(i, j, "");
			}
		}
	}
	
	/*public StringBoard(StringBoard copy)
	{
		super(copy);
	}*/
	
	@Override
	public void convertFromStringBoard(StringBoard baseBoard) 
	{
		//return baseBoard;
	}
}
