package rhsu.board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import rhsu.board.sampleImplementations.math.IntBoard;
import rhsu.board.utilities.UtilityFunctions;

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
			String strNum = in.nextLine();
		
			hasError = (!UtilityFunctions.isInteger(strNum));
			
			if(hasError)
			{
				System.out.println("Invalid entry. Try again");
			}
			else //valid number
			{
				number = Integer.parseInt(strNum);
				
				if(number <= 0)
				{
					System.out.println("Dimension cannot be negative or 0.");
					hasError = true;
				}
				else if(number > 5)
				{
					System.out.println("You have entered a number greater than 5.");
					System.out.println("It is recommended to use a different form of data entry");
					System.out.println("Do you want to continue?");
					
					boolean hasLocalError;
					do
					{
						hasLocalError = false;
						switch(in.nextLine())
						{
							case "Yes":
							case "yes":
							case "Y":
							case "y":
								break;
							case "No":
							case "no":
							case "N":
							case "n":
								hasError = true;
								System.out.println("Enter a smaller number.");
								break;
							default:
								hasLocalError = true;
								System.out.println("Invalid entry. Try again");
								System.out.println("Do you want to continue?");
								break;
						}
					}while(hasLocalError);
				}
				else
				{
					hasError = false;
				}
			}
		}while(hasError);

		return number;
	}

	private final static String DELIMITERS = "|:,\t";
	
	public static char determineDelimiter(String line)
	{
		int delimiterIndex = -1;
		int selectedDelimiter = -1;
		
		for (int i = 0; i < DELIMITERS.length(); i++)
		{
			int currentIndex = line.indexOf(DELIMITERS.charAt(i));

			if ((currentIndex < delimiterIndex && currentIndex != -1) || (currentIndex > delimiterIndex && delimiterIndex == -1))
			{
				delimiterIndex = currentIndex;
				selectedDelimiter = i;
			}
		}
		
		return (selectedDelimiter == -1 ? '\0' : DELIMITERS.charAt(selectedDelimiter));
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
				String strNum = in.nextLine();
				if(UtilityFunctions.isInteger(strNum))
				{
					b.pieceAt(i,j).setType(Integer.parseInt(strNum));
				}
				else
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
		boolean hasError;
		do
		{
			System.out.println("Enter the file name");
			String filename = in.nextLine();
			hasError = false;
			
			try (BufferedReader br = new BufferedReader(new FileReader(filename)))
			{
				String line;
				while ((line = br.readLine()) != null)
				{
					System.out.println(line);
				}
			}
			catch (IOException e)
			{
				System.out.println("ERROR: File not found");
				hasError = true;
			}
		}while(hasError);
	}

	public static void DisplayHelp()
	{
		System.out.println("This is the help option");
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);	
		boolean hasError;
		do
		{
			System.out.println("Read in by file or by input?");
			hasError = false;
			
			switch(in.nextLine())
			{
				case "file":
					ReadInByFile(in);
					break;
				case "input":
					ReadInByInput(in);
					break;
				case "help":
					DisplayHelp();
					break;
				case "exit":
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Entry.");
					hasError = true;
					break;
			}
		}while(hasError);
	}
}
