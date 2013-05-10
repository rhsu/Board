package board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
		boolean hasError;
		do
		{
			try
			{
				number = Integer.parseInt(in.nextLine());
				
				if(number <= 0)
				{
					System.out.println("Dimension cannot be negative or 0.");
					hasError = true;
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
							hasError = false;
							break;
						case "No":
						case "no":
						case "N":
						case "n":
							hasError = true;
							System.out.println("Enter a smaller number.");
							break;
						default:
							hasError = true;
							System.out.println("Invalid entry. Try again");
							break;
					}
				}
				else
				{
					hasError = false;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid entry. Try again");
				hasError = true;
			}
		}while(hasError);
		
		return number;
	}
	
	public static void ReadInByInput(Scanner in)
	{
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
	
	public static void ReadInByFile(Scanner in)
	{
		System.out.println("Enter the filename");
		String filename = in.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
			String line;
			while ((line = br.readLine()) != null) 
			{
				
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean hasError;
		do
		{
			System.out.println("Read in by file or by input?");
			switch(in.nextLine())
			{
				case "File":
				case "file":
					ReadInByFile(in);
					hasError = false;
					break;
				case "Input":
				case "input":
					ReadInByInput(in);
					hasError = false;
					break;
				default:
					System.out.println("Invalid Entry.");
					hasError = true;
					break;
			}
		}while(hasError);
	}
}
