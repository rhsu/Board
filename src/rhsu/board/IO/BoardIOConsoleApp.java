package rhsu.board.IO;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import rhsu.board.implementations.StringBoard;
import rhsu.board.utilities.UtilityFunctions;

/**
 *The board reader object allows the user to import board objects either from
 * file or by input.
 * 
 * By default, the created objects are of type String
 * 
 */
public final class BoardIOConsoleApp
{	
	/**
	 * Private scanner member
	 */
	private Scanner in;
	private BoardReader reader;
	private StringBoard outputBoard;
	
	/**
	 * Constructor for building a reader
	 */
	public BoardIOConsoleApp()
	{
		reader = new BoardReader();
		in = new Scanner(System.in);
	}
	
	public StringBoard getOutputBoard()
	{
		return outputBoard;
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
		
		writePrompt();
		
	}
	
	private void writePrompt()
	{
		System.out.println("Board successfully created.");
		System.out.println("Would you like to export?");
		String line = in.nextLine();
		
		switch(line)
		{
			case "Yes":
			case "yes":
			case "Y":
			case "y":
				System.out.println("Enter a filename");
				String filename = in.nextLine();
				//BoardWriter writer = new BoardWriter(outputBoard, filename);
				BoardWriter.write(filename, outputBoard);
				System.out.println("Exporting board as " + filename);
				System.out.println("Exiting the application");
				break;
			case "No":
			case "no":
			case "N":
			case "n":
				System.out.println("Not exporting...");
				System.out.println("The board you created is " + outputBoard);
				System.out.println("Exiting the application");
				break;
		}
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
		outputBoard = reader.buildOutputBoard(h, v, items);
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

			try
			{
				outputBoard = reader.buildOutputBoard(filename);
			}
			catch(IOException e)
			{
				outputBoard = null;
				hasError = true;
				System.out.println("Invalid Filename: Try again");
			}
		}while(hasError);
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
		BoardIOConsoleApp app = new BoardIOConsoleApp();
		app.mainPrompt();
		
		StringBoard test = app.getOutputBoard();
		
		System.out.println(test);
	}
}
