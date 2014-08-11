package rhsu.board.test;

import rhsu.board2.*;
import rhsu.board2.boardReaders.*;
import rhsu.board2.implementations.*;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
    
	public static void main(String[] args)
	{		
		AbstractBoardIO<Integer> boardIO = new IntegerBoardIO();
		boardIO.populateFromFile("test.txt", " ");
		
		CompositeBoard<Integer> test = new BoardBuilder<Integer>()
			.setHorizontalSize(3)
			.setVerticalSize(3)
			.setBoardIO(boardIO)
			.setBoardInitializable(boardIO)
			.createBoard();
		
		CompositeBoard<String> test2 = StringBoard2Composite.createStringBoardFromFile("test.txt");
		
		print(test2);
	}
}
