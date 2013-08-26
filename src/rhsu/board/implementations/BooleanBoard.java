package rhsu.board.implementations;

import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;

/**
 *A boolean implementation
 */
public class BooleanBoard extends AbstractBoard<Boolean>
{
	@SuppressWarnings({"unchecked"})
	public BooleanBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, false);
			}
		}
	}

	@SuppressWarnings({"unchecked"})
	public BooleanBoard(String filename)
	{
		super(filename);
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				board[i][j] = new BoardPiece(i, j, 
						baseBoard.getValueAt(i, j).equals("1")
						? true
						: Boolean.valueOf(baseBoard.getValueAt(i, j)));
			}
		}
	}
}
