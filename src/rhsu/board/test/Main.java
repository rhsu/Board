package rhsu.board.test;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.boardReaders.*;
import rhsu.board2.boardReaders.Board2IO;
import rhsu.board2.boardReaders.StringBoardReader;
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
		//AbstractBoardReader<Integer> test = new IntegerBoardReader();
		//test.populateFromFile("test.txt", " ");
		//print(test.getBoardInitializer());
		
		CompositeBoard<Integer> test = IntegerBoard2Composite.createIntegerBoard(3, 3);
		
		CompositeBoard<Integer> test2 = new BoardBuilder<Integer>()
			.setVerticalSize(3)
			.setHorizontalSize(3)
			.setDefaulValue(6)
			.createBoard();
		
		print(test2);
	}
}
