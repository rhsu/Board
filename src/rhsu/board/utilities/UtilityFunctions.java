package rhsu.board.utilities;

import rhsu.board.BoardPiece;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board2.randomGenerators.RandomGenerator;

/**
 *Various static functions
 */
public class UtilityFunctions 
{		
	/**
	* Checks if the user input position is valid
	* @param position The position to check
	* @param size the size of the board
	* @return True if the position of valid
	*/
	public static boolean isValidPosition(int position, int size)
	{
		return ((position >= 0) && (position < size));
	}
	
	/**
	* Usage: For creating a new SET piece
	* @return A random number between 1 and 7
	*/
	public static int getRandomNumber()
	{
		return (int)(Math.random()*7)+1;
	}
	
	/**
	 * 
	 * @param s the string to check if its a valid integer.
	 * @return True if the string is a valid integer
	 */
	public static boolean isInteger(String s)
	{
		return s.matches("-?[0-9]+");
	}
	
	public static int changeSign(int i)
	{
		return (i % 2 == 0) ? 1 : -1;
	}
	
	public static AbstractBasicBoard CreateRandomBoard(AbstractBasicBoard board)
	{
		RandomGenerator generator = board.randomGenerator();
		
		for(int i = 0; i < board.getHorizontal_size(); i++)
		{
			for(int j = 0; j < board.getVertical_size(); j++)
			{
				board.setValueAt(i, j, generator.getRandom());
			}
		}
		
		return board;
	}
	
	public static String getCoordinate(BoardPiece piece)
	{
		return String.format("(%d, %d)", 
				piece.getHorizontal(),
				piece.getVertical());
	}
}
