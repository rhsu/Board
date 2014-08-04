package rhsu.board2;

import rhsu.board.io.BoardIO;

public class BoardBuilder<T>
{
	private BoardIO boardIO = null;
	private Matrix2<T> matrix = null;
	private MobilityBoard<T> mobilityBoard = null;
	private RandomGenerator<T> randomGenerator = null;
	private Integer horizontalSize = null;
	private Integer verticalSize = null; 
	private T defaultValue = null;
	private BoardInitializable<T> boardInitializer = null;
	
	public BoardBuilder<T> setBoardIO(BoardIO boardIO)
	{
		this.boardIO = boardIO;
		return this;
	}
	
	public BoardBuilder<T> setMatrix(Matrix2<T> matrix)
	{
		this.matrix = matrix;
		return this;
	}
	
	public BoardBuilder<T> setRandomGenerator(RandomGenerator<T> randomGenerator)
	{
		this.randomGenerator = randomGenerator;
		return this;
	}
	
	public BoardBuilder<T> setMobilityBoard(MobilityBoard<T> mobilityBoard)
	{
		this.mobilityBoard = mobilityBoard;
		return this;
	}
	
	public BoardBuilder<T> setHorizontalSize(int horizontalSize)
	{
		this.horizontalSize = horizontalSize;
		return this;
	}
	
	public BoardBuilder<T> setVerticalSize(int verticalSize)
	{
		this.verticalSize = verticalSize;
		return this;
	}
	
	public BoardBuilder<T> setDefaulValue(T defaultValue)
	{
		this.defaultValue = defaultValue;
		return this;
	}
	
	public BoardBuilder<T> setBoardInitializable(BoardInitializable boardInitializer)
	{
		this.boardInitializer = boardInitializer;
		return this;
	}
	
	public CompositeBoard<T> createBoard()
	{		
		return new CompositeBoardImpl(
			this.horizontalSize,
			this.verticalSize,
			this.boardIO,
			this.matrix,
			this.mobilityBoard,
			this.randomGenerator,
			this.defaultValue,
			this.boardInitializer);
	}
}