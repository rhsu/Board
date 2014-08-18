package rhsu.board.test;

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
		AbstractBoardIO<Integer> boardIO = new AbstractBoardIOFactory().getIntegerBoardIO();
		
		CompositeBoard<Integer> test = new BoardBuilder<Integer>()
			.setHorizontalSize(5)
			.setVerticalSize(5)
			.setBoardIO(boardIO)
			.setBoardInitializable(boardIO)
			.createBoard();
		
		print(test);
	}
}
