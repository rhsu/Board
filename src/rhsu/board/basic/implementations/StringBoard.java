package rhsu.board.basic.implementations;

import java.io.BufferedReader;
import java.util.UUID;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board2.RandomGenerator;

/**
 * A string implementation
 */
public class StringBoard extends AbstractBasicBoard<String>
{
	private static final String DEFAULT_VALUE = "++";
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
	/**
	 * Constructs a string board with the given horizontal and vertical values
	 * and the specified default value
	 * @param horizontal the horizontal size
	 * @param vertical the vertical size
	 * @param defaultValue the defaultValue
	 */
	@SuppressWarnings({"unchecked"})
	public StringBoard(int horizontal, int vertical, String defaultValue)
	{
		super(horizontal, vertical, defaultValue);
	}
	
	/**
	 * Constructor to create a StringBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	@SuppressWarnings({"unchecked"})
	public StringBoard(int h, int v)
	{
		this(h, v, DEFAULT_VALUE);
	}
	
	/**
	 * Constructor to create a StringBoard based off of the values in a bufferedReader
	 * This constructor is used to build a board off of a resource that exists in the Jar.
	 * @param bufferedReader 
	 * @see rhsu.board.resources.ResourceRetriever
	 */
	@SuppressWarnings({"unchecked"})
	public StringBoard(BufferedReader bufferedReader)
	{
		super(bufferedReader);
		this.defaultValue = DEFAULT_VALUE;
	}
	
	/**
	 * Constructor to create a StringBoard based off of the values in a file
	 * @param filename the file to construct a board.
	 */
	@SuppressWarnings({"unchecked"})
	public StringBoard(String filename)
	{
		super(filename);
		this.defaultValue = DEFAULT_VALUE;
	}
	
	//</editor-fold>
	
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
	
	//<editor-fold desc="BoardIO Methods" defaultstate="collapsed">
	
	@Override
	public void initializeFromBaseBoard()
	{		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				board[i][j] = new BasicBoardPiece(i, j, 
					baseBoard.getValueAt(i, j),
					this.uuid);
			}
		}
	}
	
	//</editor-fold>
	
	@Override
	public String getDefaultValue()
	{
		return DEFAULT_VALUE;
	}
}
