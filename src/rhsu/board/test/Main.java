package rhsu.board.test;

import java.util.LinkedList;
import rhsu.board.io.BoardIO;
import rhsu.board2.*;
import rhsu.board2.boardIO.AbstractBoardIO;
import rhsu.board2.boardIO.AbstractBoardIOFactory;
import rhsu.board2.implementations.factories.BoardFactoryClient;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
    
	private static final String file1 = "konckdown.txt";
	private static final String file2 = "overexpressoin.txt";
	
	public static void main(String[] args)
	{	
		CompositeBoard<String> file1Board = new BoardFactoryClient()
			.GetStringBoardFactory()
			.createBoardFromFile(file2);
		
		LinkedList<CompositeBoard<String>> results = new LinkedList<>();
		
		for(int j = 0; j < file1Board.getVerticalSize(); j++)
		{
			String gene = file1Board.getValueAt(0, j);
		
			CompositeBoard<String> resultBoard = new BoardFactoryClient()
				.GetStringBoardFactory()
				.createBoard(3, file1Board.getHorizontalSize());

			for (int i = 1; i < file1Board.getHorizontalSize(); i++)
			{
				String[] data = file1Board.getValueAt(i, 0)
					.replace("\"", "")
					.split(",");

				resultBoard.setValueAt(0, i, gene);
				resultBoard.setValueAt(1, i, data[0]);
				resultBoard.setValueAt(2, i, data[1]);
			}

			results.add(resultBoard);
		}
		
		StringBuilder builder = new StringBuilder();
		
		for (CompositeBoard<String> board : results)
		{
			builder.append(board.toString());
		}
		
		System.out.println(builder);
	}
}
