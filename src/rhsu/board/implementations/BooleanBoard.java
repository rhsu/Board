package rhsu.board.implementations;

import java.io.BufferedReader;
import java.util.Random;
import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;
import rhsu.board.RandomGenerator;

/**
 *A boolean implementation
 */
public class BooleanBoard extends AbstractBoard<Boolean>
{
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
		this(h, v, false);
	}

	/**
	 * Constructor to create a BooleanBoard based off of a file 
	 * @param filename the name of the file to create a BooleanBoard from
	 */
	@SuppressWarnings({"unchecked"})
	public BooleanBoard(String filename)
	{
		super(filename);
		initializeFromBaseBoard();
	}
	
	public BooleanBoard(BufferedReader bufferedReader)
	{
		super(bufferedReader);
		initializeFromBaseBoard();
	}
	
	private void initializeFromBaseBoard()
	{
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
}
