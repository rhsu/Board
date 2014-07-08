package rhsu.board.test;

import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.board.*;
import rhsu.board.basic.implementations.*;
import rhsu.board.basic.implementations.arithmetic.*;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board2.Board2;
import rhsu.board2.BoardImpl;
import rhsu.board2.boardCores.IntegerBoard2;
import rhsu.board2.boardCores.StringBoard2;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
    
	public static void main(String[] args)
	{
		Board2 boardImpl = new IntegerBoard2(5,5);
		
		CompositeBoard board = new BoardBuilder()
			.setBoardCore(boardImpl)
			.createBoard();
		
		System.out.println(board.getBoardCore());
	}
}
