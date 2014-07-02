package rhsu.board.test;

import rhsu.board.*;
import rhsu.board.basic.implementations.*;
import rhsu.board.basic.implementations.arithmetic.*;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board2.Board2;
import rhsu.board2.implementations.StringBoard2;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
    
	public static void main(String[] args)
	{
		Board2<String> test = new StringBoard2(3,3);
		
		//print(test);
		
		test.setPieceAt(1, 2, "HERE");
		
		print(test);
	}
}
