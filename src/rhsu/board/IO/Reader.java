package rhsu.board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import rhsu.board.sampleImplementations.math.IntBoard;
import rhsu.board.utilities.UtilityFunctions;

/**
 *
 * @author robert
 */
public class Reader
{
	private final static String DELIMITERS = "|,\t";
	private Scanner in;
	
	public Reader()
	{
		in = new Scanner(System.in);
	}
	
	public void mainPrompt()
	{
		boolean hasError;
		do
		{
			System.out.println("Read in by file or by input?");
			System.out.println("To exit press exit");
			System.out.println("For help press help");
			hasError = false;
			
			switch(in.nextLine())
			{
				case "file":
					readInByFile(in);
					break;
				case "input":
					readInByInput(in);
					break;
				case "help":
					displayHelp();
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
	
	private int getValidNumberFromUser(Scanner in)
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
	
	public static char determineDelimiter(String line)
	{
		int selectedDelimiter = -1;
		
		for (int i = 0; i < DELIMITERS.length(); i++)
		{
			int currentIndex = line.indexOf(DELIMITERS.charAt(i));
			
			if(currentIndex != -1)
			{
				selectedDelimiter = i;
			}
		}
		
		return (selectedDelimiter == -1 ? '\0' : DELIMITERS.charAt(selectedDelimiter));
	}
	
	public void readInByInput(Scanner in)
	{
		System.out.println("Enter the number of rows");
		int h = getValidNumberFromUser(in);
		System.out.println("Enter the number of columns");
		int v = getValidNumberFromUser(in);

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
		//return b;
	}

	public void readInByFile(Scanner in)
	{		
		boolean hasError;
		
		List<int[]> testList = new LinkedList<>();
		
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
					StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS);
					int[] test2 = new int[tokenizer.countTokens()];
					
					int index = 0;
					
					while(tokenizer.hasMoreTokens())
					{
						int t = Integer.parseInt(tokenizer.nextToken().trim());
						
						test2[index] = t;
						index++;
					}
					
					testList.add(test2);
				}
			}
			catch (IOException e)
			{
				System.out.println("ERROR: File not found");
				hasError = true;
			}
		}while(hasError);
		
		IntBoard b = new IntBoard(testList.get(0).length, testList.size());
		
		int boardCounter = 0;		
		for(int[] item : testList)
		{
			for(int i = 0; i < item.length; i++)
			{
				b.pieceAt(i, boardCounter++).setType(item[i]);
			}
			System.out.println();
		}
		
		System.out.println("printingt board...");
		System.out.println(b);
	}

	public void displayHelp()
	{
		System.out.println("This is the help option");
	}
	
	public static void main(String[] args)
	{
		Reader myReader = new Reader();
		myReader.mainPrompt();
	}
}
