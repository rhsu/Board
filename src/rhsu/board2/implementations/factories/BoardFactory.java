package rhsu.board2.implementations.factories;

import rhsu.board2.arrayBoard.basicBoard.BasicBoardBuilder;
import rhsu.board2.Board2;
import rhsu.board2.boardModules.boardIO.AbstractBoardIO;
import rhsu.board2.boardModules.randomGenerators.AbstractRandomGenerator;

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
		
	public Board2<T> createBoard(int horizontalSize, 
		int verticalSize)
	{	
		return new BasicBoardBuilder<T>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setDefaulValue(this.defaultValue)
			.setBoardIO(this.boardIO)
			.createBoard();
	}
		
	public Board2<T> createRandomBoard(int horizontalSize,
		int verticalSize)
	{	
		return new BasicBoardBuilder<T>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(this.randomGenerator)
			.setBoardInitializable(this.randomGenerator)
			.setBoardIO(this.boardIO)
			.createBoard();
	}
	
	public Board2<T> createBoardFromFile(String filename, String delimiter)
	{
		this.boardIO.populateFromFile(filename, delimiter);
		
		return new BasicBoardBuilder<T>()
			.setHorizontalSize(this.boardIO.getBoardInitializer().getHorizontalSize())
			.setVerticalSize(this.boardIO.getBoardInitializer().getVerticalSize())
			.setBoardIO(this.boardIO)
			.setBoardInitializable(this.boardIO)
			.createBoard();
	}
}
