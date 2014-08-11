package rhsu.board.test;

import rhsu.board2.*;
import rhsu.board2.boardReaders.*;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
    
	public static void main(String[] args)
	{				
		CompositeBoard<String> test2 = StringBoard2Composite.createStringBoardFromFile("test.txt");
		
		print(test2);
	}
}
