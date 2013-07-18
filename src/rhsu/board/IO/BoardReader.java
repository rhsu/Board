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
public class BoardReader
{	
	private StringBoard outputBoard;
	
	public BoardReader()
	{
	}
	
	/**
	 * Creates an output board based off of user inputted items
	 * @param h the horizontal size of the board
	 * @param v the vertical size of the board
	 * @param items the user inputted items (as a queue)
	 */
	public void buildOutputBoard(int h, int v, LinkedList<String> items)
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
	public void buildOutputBoard(LinkedList<String[]> fileContent)
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
}
