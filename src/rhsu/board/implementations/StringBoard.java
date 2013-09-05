package rhsu.board.implementations;

import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;

/**
 * A string implementation
 */
public class StringBoard extends AbstractBoard<String>
{
	/**
	 * Constructor to create a StringBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	/**
	 *
	 * @param h
	 * @param v
	 */
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
	
	/**
	 * Constructor to create a StringBoard based off of a file 
	 * @param filename the name of the file to create a StringBoard from
	 */
	/**
	 *
	 * @param filename
	 */
	@SuppressWarnings({"unchecked"})
	public StringBoard(String filename)
	{
		super(filename);

		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				board[i][j] = new BoardPiece(i, j, 
						baseBoard.getValueAt(i, j));
			}
		}
	}
}
