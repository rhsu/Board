package board.utilities;

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
	* Creates a matrix to make envisioning indices easier
	*/
	public static void testMatrix()
	{
		int[][] matrix = new int[5][5];
		int ctr = 1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				matrix[i][j] = ctr++;
			}
		}
		
		System.out.println("done allocating");
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0 ; j < 5; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Hold i constant: get all vertical");
		for (int i = 0; i < 5; i++)
		{
			System.out.print(matrix[i][0] + " ");
		}
		System.out.println();
		System.out.println("Hold j constant: get all horizontal");
		for (int j = 0; j < 5; j++)
		{
			System.out.print(matrix[0][j] + " ");
		}
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
}
