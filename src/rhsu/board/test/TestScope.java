package rhsu.board.test;

import rhsu.board.BoardPiece;
import rhsu.board.implementations.basic.arithmetic.IntegerBoard;

/**
 *
 * @author rhsu
 */
public class TestScope extends IntegerBoard
{
	public TestScope(int h, int v)
	{
		super(h, v);
	}
	
	public void doSomething(int h, int v)
	{
		BoardPiece<Integer> parameterPiece = this.pieceAt(h, v);
		parameterPiece.setValue(-99);
	}
	
	public static void main(String[] args)
	{
		TestScope test = new TestScope(5,5);
		
		test.doSomething(0, 0);
	
		//test.pieceAt(0, 0).setValue(-99);
		
		
		System.out.println(test);
	}
}
