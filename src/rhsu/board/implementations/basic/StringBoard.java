package rhsu.board.implementations.basic;

import java.io.BufferedReader;
import java.util.UUID;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board.RandomGenerator;

/**
 * A string implementation
 */
public class StringBoard extends AbstractBasicBoard<String>
{
	private static final String DEFAULT_VALUE = "++";
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
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
		this(h, v, DEFAULT_VALUE);
	}
	
	@SuppressWarnings({"unchecked"})
	public StringBoard(BufferedReader bufferedReader)
	{
		super(bufferedReader);
		this.doPopulateFromResource(bufferedReader);
	}
	
	@SuppressWarnings({"unchecked"})
	public StringBoard(String filename)
	{
		super(filename);
		this.doPopulateFromFile(filename);
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
	public void populateFromResource(BufferedReader reader)
	{
		super.populateFromResource(reader);
		this.initializeFromBaseBoard();
	}
	
	@Override
	public void populateFromFile(String filename)
	{
		super.populateFromFile(filename);
		this.initializeFromBaseBoard();
	}
	
	@Override
	public void initializeFromBaseBoard()
	{		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				board[i][j] = new BasicBoardPiece(i, j, 
						baseBoard.getValueAt(i, j));
			}
		}
	}
	
	private void doPopulateFromFile(String filename)
	{
		this.populateFromFile(filename);
	}
	
	private void doPopulateFromResource(BufferedReader resource)
	{
		this.populateFromResource(resource);
	}
	
	//</editor-fold>
}
