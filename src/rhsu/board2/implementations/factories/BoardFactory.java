package rhsu.board2.implementations.factories;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.boardIO.AbstractBoardIO;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;

public class BoardFactory<T>
{
	private final T defaultValue;
	private final AbstractRandomGenerator<T> randomGenerator; 
	private final AbstractBoardIO<T> boardIO;
	
	BoardFactory(T defaultValue, 
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
			.setBoardIO(boardIO)
			.createBoard();
	}
		
	public CompositeBoard<T> createRandomBoard(int horizontalSize,
		int verticalSize)
	{	
		return new BoardBuilder<T>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(this.randomGenerator)
			.setBoardInitializable(this.randomGenerator)
			.setBoardIO(boardIO)
			.createBoard();
	}
	
	public CompositeBoard<T> createBoardFromFile(String filename, String delimiter)
	{
		this.boardIO.populateFromFile(filename, delimiter);
		
		return new BoardBuilder<T>()
			.setHorizontalSize(this.boardIO.getBoardInitializer().getHorizontalSize())
			.setVerticalSize(this.boardIO.getBoardInitializer().getVerticalSize())
			.setBoardIO(this.boardIO)
			.setBoardInitializable(this.boardIO)
			.createBoard();
	}
}
