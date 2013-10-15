package rhsu.board.implementations;

import java.util.Random;
import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;
import rhsu.board.RandomGenerator;

/**
 *A character implementation
 */
public class CharBoard extends AbstractBoard<Character>
{
	@SuppressWarnings({"unchecked"})
	public CharBoard(int h, int v, char defaultValue)
	{
		super(h, v, defaultValue);
	}
	
	/**
	 * Constructor to create a Character Board with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	public CharBoard(int h, int v)
	{
		this(h, v, ' ');
	}

	/**
	 * Constructor to create a Character Board based off of a file 
	 * @param filename the name of the file to create a Character Board from
	 */
	@SuppressWarnings({"unchecked"})
	public CharBoard(String filename)
	{
		super(filename);

		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				board[i][j] = new BoardPiece(i, j, 
						baseBoard.getValueAt(i, j).charAt(0));
			}
		}
	}

	@Override
	public RandomGenerator<Character> randomGenerator() 
	{
		RandomGenerator<Character> generator = new RandomGenerator()
		{
			final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
			final int N = ALPHABET.length();
			
			Random random = new Random();
			
			@Override
			public Character getRandom() 
			{
				return ALPHABET.charAt(random.nextInt(N));
			}
		};
		return generator;
	}
}
