package rhsu.board.implementations.basic;

import java.io.BufferedReader;
import java.util.Random;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board.RandomGenerator;

/**
 *A boolean implementation
 */
public class BooleanBoard extends AbstractBasicBoard<Boolean>
{
	private static final boolean DEFAULT_VALUE = false;
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
	@SuppressWarnings({"unchecked"})
	public BooleanBoard(int h, int v, boolean defaultValue)
	{
		super(h, v, defaultValue);
	}
	
	/**
	 * Constructor to create a BooleanBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	public BooleanBoard(int h, int v)
	{
		this(h, v, DEFAULT_VALUE);
	}

	public BooleanBoard(String filename)
	{
		super(filename);
		this.doPopulateFromFile(filename);
	}
	
	public BooleanBoard(BufferedReader reader)
	{
		super(reader);
		this.doPopulateFromResource(reader);
	}
	//</editor-fold>
		
	@Override
	public RandomGenerator<Boolean> randomGenerator()
	{
		RandomGenerator<Boolean> generator = new RandomGenerator()
		{
			Random random = new Random();
			
			@Override
			public Boolean getRandom() 
			{
				return random.nextBoolean();
			}
		};
		return generator;
	}
		
	//<editor-fold desc="BoardIO methods" defaultstate="collapsed">
	
	@Override
	public void initializeFromBaseBoard()
	{
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				board[i][j] = new BasicBoardPiece(i, j, 
						baseBoard.getValueAt(i, j).equals("1")
						? true
						: Boolean.valueOf(baseBoard.getValueAt(i, j)));
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
