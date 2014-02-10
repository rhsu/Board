package rhsu.board.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board.Board;
import rhsu.board.basic.implementations.arithmetic.BigDecimalBoard;
import rhsu.board.basic.implementations.arithmetic.BigIntegerBoard;
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
		BigDecimalBoard test = new BigDecimalBoard(
			ResourceRetriever.GetResource("arithmeticOp1", TEST_RESOURCE));
		
		print(test);
		print("-----");
		print(test.multiply(BigDecimal.TEN));

	}
}
