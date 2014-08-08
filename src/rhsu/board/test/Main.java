package rhsu.board.test;

import rhsu.board2.BoardReaders.Board2IO;
import rhsu.board2.BoardReaders.AbstractBoardIO;
import rhsu.board2.CompositeBoard;
import rhsu.board2.implementations.BooleanBoard2Composite;
import rhsu.board2.implementations.CharacterBoard2Composite;
import rhsu.board2.implementations.IntegerBoard2Composite;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
    
	public static void main(String[] args)
	{
		AbstractBoardIO test = new AbstractBoardIO();
		test.populateFromFile("test.txt", " ");
		print(test.getBoardInitializer());
	}
}
