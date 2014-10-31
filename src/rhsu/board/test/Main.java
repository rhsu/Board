package rhsu.board.test;

import java.util.List;
import rhsu.board.io.BoardIO;
import rhsu.board2.*;
import rhsu.board2.basicBoard.BasicBoardBuilder;
import rhsu.board2.boardIO.AbstractBoardIO;
import rhsu.board2.boardIO.AbstractBoardIOFactory;
import rhsu.board2.implementations.factories.BoardFactoryClient;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
	
	public static class TestModule<T> implements BoardModule<T>
	{
		private Board2<T> parent;
		
		public TestModule()
		{
			this.parent = new BasicBoardBuilder()
				.setHorizontalSize(1)
				.setVerticalSize(1)
				.setDefaulValue(1)
				.createBoard();
		}
		
		@Override
		public Board2<T> getParent() 
		{
			return this.parent;
		}

		@Override
		public void setParent(Board2<T> parent) 
		{
			this.parent = parent;
		}
		
		@Override
		public String toString()
		{
			return "Hi!";
		}
	}
	
	public static void main(String[] args)
	{	
		BoardModule<Integer> module = new TestModule<>();
		
		Board2<Integer> test = new BasicBoardBuilder()
			.setDefaulValue(10)
			.setHorizontalSize(1)
			.setVerticalSize(1)
			.createBoard();
	}
}