package rhsu.board.basic.implementations;

import java.io.BufferedReader;
import java.util.Random;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board2.Board2;
import rhsu.board2.randomGenerators.RandomGenerator;

/**
 * A boolean implementation
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
	 * and a default value of false
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	public BooleanBoard(int h, int v)
	{
		this(h, v, DEFAULT_VALUE);
	}

	/**
	 * Constructor to create a BooleanBoard based off of the values in a file
	 * @param filename the file to construct a board.
	 */
	public BooleanBoard(String filename)
	{
		super(filename);
		this.defaultValue = DEFAULT_VALUE;
	}
	
	/**
	 * Constructor to create a BooleanBoard based off of the values in a bufferedReader
	 * This constructor is used to build a board off of a resource that exists in the Jar.
	 * @param reader the BufferedReader object to populate from.
	 * @see rhsu.board.resources.ResourceRetriever
	 */
	public BooleanBoard(BufferedReader reader)
	{
		super(reader);
		this.defaultValue = DEFAULT_VALUE;
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
						: Boolean.valueOf(baseBoard.getValueAt(i, j)),
						this.uuid);
			}
		}
	}
	
	//</editor-fold>
	
	@Override
	public Boolean getDefaultValue()
	{
		return DEFAULT_VALUE;
	}
}
