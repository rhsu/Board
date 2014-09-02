package rhsu.board.test;

import java.util.List;
import rhsu.board.io.BoardIO;
import rhsu.board2.*;
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
    
	public static void main(String[] args)
	{	
	/*AbstractBoardIO<String> boardIO = new AbstractBoardIOFactory().getStringBoardIO();
		boardIO.populateFromFile("test.txt", " ");
		
		CompositeBoard<String> test = new BoardBuilder()
			.setBoardIO(boardIO)
			.setBoardInitializable(boardIO)
			.createBoard();
		
		BoardPiece2<String> thing = test.getPieceAt(0, 0);*/
		
		CompositeBoard<String> test = new BoardFactoryClient()
			.GetStringBoardFactory()
			.createBoard(5, 5);
		
		List<BoardPiece2<String>> things = test.findAll("++");
		
		for (BoardPiece2<String> thing : things)
		{
			print(thing.getHorizontalIndex());
			print(thing.getVerticalIndex());
		}
		

	}
}
