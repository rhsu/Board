package rhsu.board.test;

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
		AbstractBoardIO<String> boardIO = new AbstractBoardIOFactory().getStringBoardIO();
		boardIO.populateFromFile("test.txt", " ");
		
		CompositeBoard<String> test = new BoardBuilder()
			.setBoardIO(boardIO)
			.setBoardInitializable(boardIO)
			.createBoard();
		
		print(test);
	}
}
