package rhsu.board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import rhsu.board.implementations.StringBoard;
import rhsu.board.implementations.math.IntegerBoard;
import rhsu.board.utilities.UtilityFunctions;

/**
 *
 * @author robert
 */
public class BoardReader
{
	/**
	 * A string containing all the supported delimiters
	 */
	private final static String DELIMITERS = " |,;:\t";
	private StringBoard outputBoard;
	
	public StringBoard getOutputBoard()
	{
		return outputBoard;
	}
	
	/**
	 * Private scanner member
	 */
	private Scanner in;
	
	/**
	 * Constructor for building a reader
	 */
	public BoardReader()
	{
		in = new Scanner(System.in);
	}
	
	/**
	 * The main prompt
	 */
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
					readInByFilePrompt();
					break;
				case "input":
					readInByInputPrompt();
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
	
	/**
	 * Asks the user to enter a valid user.
	 * Contains error checking
	 * @param in the Scanner
	 * @return a valid number
	 */
	private int getValidNumberFromUser()
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
	
	/**
	 * Reads in hard input
	 * @param in 
	 */
	public void readInByInputPrompt()
	{
		System.out.println("Enter the number of rows");
		int h = getValidNumberFromUser();
		System.out.println("Enter the number of columns");
		int v = getValidNumberFromUser();

		outputBoard = new StringBoard(h, v);

		System.out.println("Enter the elements of the matrix");

		for(int i = 0; i < outputBoard.getHorizontal_size(); i++)
		{
			for(int j = 0; j < outputBoard.getVertical_size(); j++)
			{				
				outputBoard.pieceAt(i, j).setType(in.nextLine());
			}
		}
	}
	
	public StringBoard createOutputBoard(int h, int v, List<string> items)
	{
		for(int i = 0; i < h; i++)
		{
			outputBoard.pieceAt(i,j).setType(items
		}
	}

	/**
	 * Reads in from file
	 */
	public void readInByFilePrompt()
	{		
		boolean hasError;
		
		List<String[]> fileContent = new LinkedList<>();
		
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
					String[] delimitedLines = new String[tokenizer.countTokens()];
					
					int index = 0;
					
					while(tokenizer.hasMoreTokens())
					{
						delimitedLines[index] = tokenizer.nextToken().trim();
						index++;
					}
					
					fileContent.add(delimitedLines);
				}
			}
			catch (IOException e)
			{
				System.out.println("ERROR: File not found");
				hasError = true;
			}
		}while(hasError);
		
		outputBoard = new StringBoard(fileContent.size(), fileContent.get(0).length);
		
		int boardCounter = 0;		
		for(String[] item : fileContent)
		{
			for(int i = 0; i < item.length; i++)
			{
				outputBoard.pieceAt(boardCounter, i).setType(item[i]);
			}
			boardCounter++;
		}
	}

	/**
	 * Displays help
	 */
	public void displayHelp()
	{
		System.out.println("This is the help option");
	}
	
	/**
	 * Sample usage of Reader
	 * @param args 
	 */
	public static void main(String[] args)
	{
		BoardReader myReader = new BoardReader();
		myReader.mainPrompt();
	}
}
