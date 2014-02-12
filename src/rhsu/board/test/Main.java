package rhsu.board.test;

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
		IntegerBoard test = new IntegerBoard(ResourceRetriever.GetResource("ExampleIntegerBoard"));
		
		print(test.getDefaultValue());
	}
}
