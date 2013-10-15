package rhsu.board.implementations;

import java.util.UUID;
import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;
import rhsu.board.RandomGenerator;

/**
 * A string implementation
 */
public class StringBoard extends AbstractBoard<String>
{
	@SuppressWarnings({"unchecked"})
	public StringBoard(int h, int v, String defaultValue)
	{
		super(h, v, defaultValue);
	}
	
	/**
	 * Constructor to create a StringBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	@SuppressWarnings({"unchecked"})
	public StringBoard(int h, int v)
	{
		this(h, v, " ");
	}
	
	/**
	 * Constructor to create a StringBoard based off of a file 
	 * @param filename the name of the file to create a StringBoard from
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

	@Override
	public RandomGenerator<String> randomGenerator() 
	{
		RandomGenerator<String> generator = new RandomGenerator()
		{
			@Override
			public String getRandom() 
			{
				return UUID.randomUUID().toString();
			}
		};
		return generator;
	}
}
