package rhsu.board.test;

import rhsu.board.Board;
import rhsu.board.basic.implementations.StringBoard;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.resources.ResourceRetriever;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
    
	public static void main(String[] args)
	{
		Board<Integer> source = new IntegerBoard(
				ResourceRetriever.GetResource("testMoveBoardSource", TEST_RESOURCE));
		
		Board<Integer> destination = new IntegerBoard(
				ResourceRetriever.GetResource("testMoveBoardDestination",TEST_RESOURCE));
		
		Board<Integer> result;
		
		
		source.move(source.getPieceAt(0,0), 0, 0, destination);
				
		print(source);
	}

}
