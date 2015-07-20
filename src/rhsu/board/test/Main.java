package rhsu.board.test;

import rhsu.board2.boardModules.BoardModule;
import java.util.List;
import rhsu.board.io.BoardIO;
import rhsu.board2.*;
import rhsu.board2.basicBoard.BasicBoardBuilder;
import rhsu.board2.boardModules.boardIO.AbstractBoardIO;
import rhsu.board2.boardModules.boardIO.AbstractBoardIOFactory;
import rhsu.board2.implementations.factories.BoardFactoryClient;

public class Main
{	
	public int Thing;
	
	public Main()
	{
		
	}
	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
	
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Main))
			return false;
		else
			return this.hashCode() == o.hashCode();
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 71 * hash + this.Thing;
		return hash;
	}
	
	public static void main(String[] args)
	{	
		Main one =  new Main();
		Main two = new Main();
		
		print(one == two);
		print(one.equals(two));
	}
}