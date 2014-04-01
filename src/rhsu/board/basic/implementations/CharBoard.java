package rhsu.board.basic.implementations;

import java.io.BufferedReader;
import java.util.Random;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board.RandomGenerator;

/**
 * A character implementation
 */
public class CharBoard extends AbstractBasicBoard<Character>
{
	private static final Character DEFAULT_VALUE = '+';
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
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
		this(h, v, DEFAULT_VALUE);
	}

	public CharBoard(String filename)
	{
		super(filename);
		this.defaultValue = DEFAULT_VALUE;
	}

	public CharBoard(BufferedReader bufferedReader)
	{
		super(bufferedReader);
		this.defaultValue = DEFAULT_VALUE;
	}
	
	//</editor-fold>
				
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
	
	//<editor-fold desc="BoardIO Methods" defaultstate="collapsed">
	
	@Override
	public void initializeFromBaseBoard()
	{
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				board[i][j] = new BasicBoardPiece(i, j, 
						baseBoard.getValueAt(i, j).charAt(0));
			}
		}
	}
	
	//</editor-fold>
	
	@Override
	public Character getDefaultValue()
	{
		return DEFAULT_VALUE;
	}
}
