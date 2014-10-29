package rhsu.board2;

import rhsu.board2.mobility.MobilityBoard;
import rhsu.board2.randomGenerators.RandomGenerator;
import rhsu.board2.matrices.Matrix2;
import rhsu.board2.boardIO.Board2IO;

public class BasicBoardBuilder<T>
{
	protected Board2IO boardIO = null;
	protected Matrix2<T> matrix = null;
	protected MobilityBoard<T> mobilityBoard = null;
	protected RandomGenerator<T> randomGenerator = null;
	protected Integer horizontalSize = null;
	protected Integer verticalSize = null; 
	protected T defaultValue = null;
	protected BoardInitializable<T> boardInitializer = null;
	
	public BasicBoardBuilder<T> setBoardIO(Board2IO<T> boardIO)
	{
		this.boardIO = boardIO;
		return this;
	}
	
	public BasicBoardBuilder<T> setMatrix(Matrix2<T> matrix)
	{
		this.matrix = matrix;
		return this;
	}
	
	public BasicBoardBuilder<T> setRandomGenerator(RandomGenerator<T> randomGenerator)
	{
		this.randomGenerator = randomGenerator;
		return this;
	}
	
	public BasicBoardBuilder<T> setMobilityBoard(MobilityBoard<T> mobilityBoard)
	{
		this.mobilityBoard = mobilityBoard;
		return this;
	}
	
	public BasicBoardBuilder<T> setHorizontalSize(int horizontalSize)
	{
		this.horizontalSize = horizontalSize;
		return this;
	}
	
	public BasicBoardBuilder<T> setVerticalSize(int verticalSize)
	{
		this.verticalSize = verticalSize;
		return this;
	}
	
	public BasicBoardBuilder<T> setDefaulValue(T defaultValue)
	{
		this.defaultValue = defaultValue;
		return this;
	}
	
	public BasicBoardBuilder<T> setBoardInitializable(BoardInitializable<T> boardInitializer)
	{
		this.boardInitializer = boardInitializer;
		return this;
	}
	
	public CompositeBoard<T> createBoard()
	{		
		return new BasicBoard(
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
