package rhsu.board.test;

import rhsu.board.*;
import rhsu.board.basic.implementations.*;
import rhsu.board.basic.implementations.arithmetic.*;
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
		double a = 6.00000000000000000000000000000000000001;
		double b = 6.00;
		
		System.out.println(Double.compare(a, b));
	}

}
