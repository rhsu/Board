package rhsu.board.test;

import java.util.List;
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
    
	public static void main(String[] args)
	{	
		CompositeBoard<Integer> test = new BoardBuilder<Integer>()
			.setHorizontalSize(5)
			.setDefaulValue(2)
			.setVerticalSize(4)
			.setBoardIO(new AbstractBoardIOFactory().getIntegerBoardIO())
			.createBoard();
		print(test);

		
		test.getBoardIO().export("output", '|');
//	new BoardFactoryClient()
		//		.GetStringBoardFactory()
		//		.createBoardFromFile("test.txt");
		
		
	}
}
