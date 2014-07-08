package rhsu.compositeBoard.implementations;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.BoardImpl;
import rhsu.board2.matrix.Matrix2;
import rhsu.board2.random.RandomBoard;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.CompositeBoardImpl;
import rhsu.compositeBoard.MobilityBoard;

public class CharacterBoard2Composite extends CompositeBoardImpl<Character>
{
	static final Character DEFAULT_VALUE = '+';

	public CharacterBoard2Composite(Board2<Character> boardCore, 
		BoardIO boardIO, 
		Matrix2<Character> matrix, 
		MobilityBoard<Character> mobilityBoard, 
		RandomBoard<Character> randomBoard)
	{
		super(boardCore, boardIO, matrix, mobilityBoard, randomBoard);
	}
	
	public static CompositeBoard<Character> createCharacterBoard(int horizontalSize, 
		int verticalSize,
		Character defaultValue)
	{
		return new BoardBuilder()
			.setBoardCore(new BoardImpl<Character>(horizontalSize, verticalSize, defaultValue) )
			.createBoard();
	}
	
	public static CompositeBoard<Character> createCharacterBoard(int horizontalSize, int verticalSize)
	{		
		return createCharacterBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
