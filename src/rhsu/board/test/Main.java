package rhsu.board.test;

import rhsu.board2.boardModules.BoardModule;
import java.util.List;
import rhsu.board.io.BoardIO;
import rhsu.board2.*;
import rhsu.board2.basicBoard.BasicBoardBuilder;
import rhsu.board2.boardModules.boardIO.AbstractBoardIO;
import rhsu.board2.boardModules.boardIO.AbstractBoardIOFactory;
import rhsu.board2.implementations.factories.BoardFactoryClient;
import rhsu.resourceRetriever.ResourceRetriever;
import rhsu.resourceRetriever.ResourceRetrieverImpl;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
	
	public static void main(String[] args)
	{	
		ResourceRetriever retriever = new ResourceRetrieverImpl(
			"newFile",
			"/rhsu/board2/unitTest/resources");
		
		Board2<String> myBoard = new BoardFactoryClient()
			.GetStringBoardFactory()
			.createBoardFromFile(TEST_RESOURCE, TEST_RESOURCE);
	}
}