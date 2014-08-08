package rhsu.board.test;

import rhsu.board2.Board2IO;
import rhsu.board2.Board2IOImpl;
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
		Board2IOImpl test = new Board2IOImpl();
		test.populateFromFile("test.txt", " ");
		print(test.getBoardInitializer())	;
	}
}
