package rhsu.board.reader;

import java.util.Scanner;
import rhsu.board.sampleImplementations.math.IntegerBoard;

/**
 *
 * @author robert
 */
public class Reader 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Size of the Matrix");
		System.out.println("Enter the number of columns");
		String h = in.nextLine();
		System.out.println("Enter the number of rows");
		String v = in.nextLine();
		
		IntegerBoard b = new IntegerBoard(Integer.parseInt(h), Integer.parseInt(v));
		
		b.pieceAt(0,0).setType(1);
		
		System.out.println("Enter the elements of the matrix");
		for(int i = 0; i < b.getHorizontal_size(); i++)
		{
			for(int j = 0; j < b.getVertical_size(); j++)
			{
				b.pieceAt(i,j).setType(Integer.parseInt(in.nextLine()));	
			}	
		}
		
		System.out.println(b);
	}
}
