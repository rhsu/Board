package rhsu.board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import rhsu.board.implementations.StringBoard;
import rhsu.board.utilities.UtilityFunctions;

/**
 *The board reader object allows the user to import board objects either from
 * file or by input.
 * 
 * By default, the created objects are of type String
 * 
 */
public final class BoardReaderConsoleApp
{	
	private class BoardReaderOutputBuilder
	{
		private StringBoard outputBoard;

		/**
		 * Creates an output board based off of user inputted items
		 * @param h the horizontal size of the board
		 * @param v the vertical size of the board
		 * @param items the user inputted items (as a queue)
		 */
		private void buildOutputBoard(int h, int v, LinkedList<String> items)
		{
			outputBoard = new StringBoard(h, v);

			for(int i = 0; i < h; i++)
			{
				for(int j = 0; j < v; j++)
				{
					outputBoard.setTypeAt(i, j, items.remove());
				}
			}
		}

		/**
		 * sets up the output board based off of a file
		 * @param fileContent the file contents to populate a board
		 */
		private void buildOutputBoard(LinkedList<String[]> fileContent)
		{
			outputBoard = new StringBoard(fileContent.size(), fileContent.get(0).length);
			int boardCounter = 0;		
			for(String[] item : fileContent)
			{
				for(int i = 0; i < item.length; i++)
				{
					outputBoard.setTypeAt(boardCounter, i, item[i]);
				}
				boardCounter++;
			}
		}

		private StringBoard getOutputBoard()
		{
			return outputBoard;
		}
	}
	
	/**
	 * All the supported delimiters: space, pipe, comma, semicolon, colon, tab
	 */
	private final static String DELIMITERS = " |,;:\t";
	
	/**
	 * Private scanner member
	 */
	private Scanner in;
	
	private BoardReaderOutputBuilder builder;
	
	/**
	 * Constructor for building a reader
	 */
	public BoardReaderConsoleApp()
	{
		builder = new BoardReaderOutputBuilder();
		in = new Scanner(System.in);
	}
	
	public StringBoard getOutputBoard()
	{
		return builder.getOutputBoard();
	}
	
	/**
	 * The main prompt
	 */
	private void mainPrompt()
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
							case "back":
							case "Back":
								mainPrompt();
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
	private void readInByInputPrompt()
	{
		System.out.println("Enter the number of rows");
		int h = getValidNumberFromUser();
		System.out.println("Enter the number of columns");
		int v = getValidNumberFromUser();

		LinkedList<String> items = new LinkedList<>();

		System.out.println("Enter the elements of the board line by line");
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				String inNextLine = in.nextLine();
				checkReturnToMainPrompt(inNextLine);
				items.offer(inNextLine);
			}
		}
		builder.buildOutputBoard(h, v, items);
	}
	
	/**
	 * Reads in from file
	 */
	private void readInByFilePrompt()
	{		
		boolean hasError;
		
		LinkedList<String[]> fileContent = new LinkedList<>();
		
		do
		{
			System.out.println("Enter the file name");
			String nextLine = in.nextLine();
			
			if(checkReturnToMainPrompt(nextLine)) return;
			
			String filename = nextLine;
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
		
		builder.buildOutputBoard(fileContent);
	}
	
	/**
	 * Allows the user to return back to the main prompt
	 * @param inNextLine
	 * @return true or false if the enter entered back
	 */
	private boolean checkReturnToMainPrompt(String inNextLine)
	{
		if(inNextLine.equalsIgnoreCase("back")) 
		{
			mainPrompt();
			return true;
		}
		return false;
	}
	
	/**
	 * Displays help
	 */
	private void displayHelp()
	{
		System.out.println("This is the help option");
	}
	
	public static void LaunchApp()
	{
		BoardReaderConsoleApp app = new BoardReaderConsoleApp();
		app.mainPrompt();
		
		StringBoard test = app.getOutputBoard();
		
		System.out.println(test);
	}
}
