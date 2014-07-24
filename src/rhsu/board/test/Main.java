package rhsu.board.test;

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
		//CompositeBoard<Character> board = CharacterBoard2Composite.createCharacterBoard(5, 5);
		//CompositeBoard<Character> board = CharacterBoard2Composite.createCharacterRandomBoard(5, 5);
		CompositeBoard<Boolean> board = BooleanBoard2Composite.createRandomBooleanBoard(5, 5);
		
		print(board);
	}
}
