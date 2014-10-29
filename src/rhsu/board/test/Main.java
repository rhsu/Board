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
		CompositeBoard<String> test = new BoardFactoryClient()
			.GetStringBoardFactory()
			.createRandomBoard(5, 5);
		
		test.getBoardIO().export("testing123", "|");
		
	}
}