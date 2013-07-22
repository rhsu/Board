package rhsu.board.implementations;

import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;

/**
 *A character implementation
 */
public class CharBoard extends AbstractBoard<Character>
{
	@SuppressWarnings({"unchecked"})
	public CharBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, ' ');
			}
		}
	}

	/*public CharBoard(StringBoard copy)
	{
		super(copy);
		this.convertFromStringBoard(copy);
	}*/
	
	public void convertFromStringBoard(StringBoard baseBoard) 
	{
		/*Board<CharPiece> result = new CharBoard(baseBoard.getHorizontal_size(), baseBoard.getVertical_size());
		
		try
		{
			for(int h = 0; h < baseBoard.getHorizontal_size(); h++)
			{
				for(int v = 0; v < baseBoard.getVertical_size(); v++)
				{
					result.pieceAt(h, v).setType(baseBoard.pieceAt(h,v).getType().charAt(0));
				}
			}
			//return result;
		}
		catch(NumberFormatException e)
		{
			//return null;
		}*/
	}
}
