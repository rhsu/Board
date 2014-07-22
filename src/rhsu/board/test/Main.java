package rhsu.board.test;

import java.math.BigDecimal;
import rhsu.board2.random.implementations.BigDecimalRandomBoard;
import rhsu.board2.random.implementations.CharacterRandomBoard;
import rhsu.compositeBoard.CompositeBoard;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
    
	public static void main(String[] args)
	{
		CompositeBoard<Character> board = CharacterRandomBoard.createBigDecimalRandomBoard(5, 5);
		
		print(board);
	}
}
