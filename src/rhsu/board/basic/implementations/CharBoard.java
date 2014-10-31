package rhsu.board.basic.implementations;

import java.io.BufferedReader;
import java.util.Random;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board2.Board2;
import rhsu.board2.randomGenerators.RandomGenerator;

/**
 * A character implementation
 */
public class CharBoard extends AbstractBasicBoard<Character>
{
	private static final Character DEFAULT_VALUE = '+';
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
	/**
	 * Constructor to create a CharacterBoard with the given parameters
	 * and a default value of +
	 * @param horizontal the horizontal size
	 * @param vertical the vertical size
	 * @param defaultValue the default value
	 */
	@SuppressWarnings({"unchecked"})
	public CharBoard(int horizontal, int vertical, char defaultValue)
	{
		super(horizontal, vertical, defaultValue);
	}
	

	/**
	 * Constructs a Character Board with the given horizontal and vertical size
	 * @param horizontal the horizontal size
	 * @param vertical the vertical size
	 */
	public CharBoard(int horizontal, int vertical)
	{
		this(horizontal, vertical, DEFAULT_VALUE);
	}

	/**
	 * Constructor to create a CharBoard based off of the values in a file
	 * @param filename the file to construct a board
	 */
	public CharBoard(String filename)
	{
		super(filename);
		this.defaultValue = DEFAULT_VALUE;
	}

	/**
	 * Constructor to create a CharBoard based off of the values in a bufferedReader
	 * This constructor is used to build a board off of a resource that exists in the Jar
	 * @param bufferedReader the BufferedReader object to populate from
	 * @see rhsu.board.resources.ResourceRetriever
	 */
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

			@Override
			public Board2 getParent() {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}

			@Override
			public void setParent(Board2 parent) {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
						baseBoard.getValueAt(i, j).charAt(0),
						this.uuid);
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
