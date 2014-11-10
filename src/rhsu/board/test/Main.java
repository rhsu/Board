package rhsu.board.test;

import rhsu.board2.Board2;
import rhsu.board2.arrayBoard.expandableBoard.ExpandableBoard;
import rhsu.board2.arrayBoard.expandableBoard.ExpandableBoardBuilder;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
	
	public static void main(String[] args)
	{	
		Board2<String> test = new ExpandableBoardBuilder<String>()
			.setHorizontalSize(5)
			.setVerticalSize(5)
			.createBoard();
		
		print(test.getVerticalSize());
		print(test.getHorizontalSize());
	}
}