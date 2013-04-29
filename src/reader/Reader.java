package reader;

import java.util.Scanner;
import sampleImplementations.math.IntBoard;

/**
 *
 * @author robert
 */
public class Reader 
{
	private static int GetValidNumberFromUser(Scanner in)
	{
		int number = 0;
		boolean error;
		do
		{
			try
			{
				number = Integer.parseInt(in.nextLine());
				
				if(number <= 0)
				{
					System.out.println("Dimension cannot be negative or 0.");
					error = true;
				}
				
				else if(number > 10)
				{
					System.out.println("You have entered a number greater than 10. Are you sure you want to continue");
					switch(in.nextLine())
					{
						case "Yes":
						case "yes":
						case "Y":
						case "y":
							error = false;
							break;
						case "No":
						case "no":
						case "N":
						case "n":
							error = true;
							System.out.println("Enter a smaller number.");
							break;
						default:
							error = true;
							System.out.println("Invalid entry. Try again");
							break;
					}
				}
				else
				{
					error = false;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid entry. Try again");
				error = true;
			}
		}
		while(error);
		
		return number;
	}
	
	public static void ReadInByInput()
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int h = GetValidNumberFromUser(in);
		System.out.println("Enter the number of columns");
		int v = GetValidNumberFromUser(in);
				
		IntBoard b = new IntBoard(h, v);
						
		System.out.println("Enter the elements of the matrix");
		for(int i = 0; i < b.getHorizontal(); i++)
		{
			for(int j = 0; j < b.getVertical(); j++)
			{
				try
				{
					b.pieceAt(i,j).setType(Integer.parseInt(in.nextLine()));	
				}
				catch(NumberFormatException e)
				{
					System.out.println("Invalid entry. Try again");
					j--;
				}
			}	
		}
		
		System.out.println(b);
	}
	
	public static void ReadInByFile()
	{
		
	}
	
	public static void main(String[] args)
	{
		ReadInByInput();
	}
}
