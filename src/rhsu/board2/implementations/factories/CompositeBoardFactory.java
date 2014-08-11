package rhsu.board2.implementations.factories;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.boardReaders.AbstractBoardIO;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;

public class CompositeBoardFactory<T>
{
	private final T defaultValue;
	private final AbstractRandomGenerator<T> randomGenerator; 
	private final AbstractBoardIO<T> boardIO;
	
	public CompositeBoardFactory(T defaultValue, 
		AbstractRandomGenerator<T> randomGenerator,
		AbstractBoardIO<T> boardIO)
	{
		this.defaultValue = defaultValue;
		this.randomGenerator = randomGenerator;
		this.boardIO = boardIO;
	}
		
	public CompositeBoard<T> createBoard(int horizontalSize, 
		int verticalSize)
	{	
		return new BoardBuilder<T>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setDefaulValue(this.defaultValue)
			.createBoard();
	}
		
	public CompositeBoard<T> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{	
		return new BoardBuilder<T>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(this.randomGenerator)
			.setBoardInitializable(this.randomGenerator)
			.createBoard();
	}
	
	public CompositeBoard<T> createBoardFromFile(String filename)
	{
		return new BoardBuilder<T>()
			.setHorizontalSize(boardIO.getBoardInitializer().getHorizontalSize())
			.setVerticalSize(boardIO.getBoardInitializer().getVerticalSize())
			.setBoardIO(boardIO)
			.setBoardInitializable(boardIO)
			.createBoard();
	}
}
