package rhsu.board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import rhsu.board.AbstractPiece;
import rhsu.board.BaseBoard;
import rhsu.board.implementations.math.IntegerPiece;

/**
 *
 * @author rhsu
 */
public class BoardReaderGeneric<T extends AbstractPiece> implements BoardReader<T>
{
	protected final static String DELIMITERS = "|,;:\t";
	protected Scanner in;
	protected BaseBoard<T> outputBoard;
	
	public BoardReaderGeneric()
	{
		in = new Scanner(System.in);
	}
	
	@Override
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
					readInByFile();
					break;
				case "input":
					readInByInput();
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

	@Override
	public void readInByInput() 
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
		
		//IntBoard b = new IntBoard(testList.get(0).length, testList.size());
		//BaseBoard<T> b = new BaseBoard(4,4);
		
		outputBoard = new BaseBoard(testList.get(0).length, testList.size());
		
		int boardCounter = 0;		
		for(int[] item : testList)
		{
			for(int i = 0; i < item.length; i++)
			{
				outputBoard.pieceAt(i, boardCounter).setType(item[i]);
			}
			boardCounter++;
			System.out.println();
		}
		
		System.out.println("printingt board...");
		System.out.println(outputBoard);
	}

	@Override
	public void readInByFile() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	@Override
	public void displayHelp()
	{
		System.out.println("This is the help option");
	}
	
	public static void main(String[] args)
	{
		BoardReaderGeneric<IntegerPiece> reader = new BoardReaderGeneric<>();
		reader.mainPrompt();
	}
}
