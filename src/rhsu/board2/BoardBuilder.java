package rhsu.board2;

import rhsu.board2.randomGenerators.RandomGenerator;
import rhsu.board2.matrices.Matrix2;
import rhsu.board2.boardIO.Board2IO;

public class BoardBuilder<T>
{
	private Board2IO boardIO = null;
	private Matrix2<T> matrix = null;
	private MobilityBoard<T> mobilityBoard = null;
	private RandomGenerator<T> randomGenerator = null;
	private Integer horizontalSize = null;
	private Integer verticalSize = null; 
	private T defaultValue = null;
	private BoardInitializable<T> boardInitializer = null;
	
	public BoardBuilder<T> setBoardIO(Board2IO<T> boardIO)
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
	
	public BoardBuilder<T> setBoardInitializable(BoardInitializable<T> boardInitializer)
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
