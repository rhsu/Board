package rhsu.board2;

import rhsu.board2.boardModules.boardFileIO.BoardFileIO;
import rhsu.board2.boardModules.matrices.Matrix2;
import rhsu.board2.boardModules.mobility.MobilityBoard;
import rhsu.board2.boardModules.randomGenerators.RandomGenerator;

public abstract class AbstractBoardBuilder<T> implements BoardBuilder<T>
{
	protected BoardFileIO<T> boardIO = null;
	protected Matrix2<T> matrix = null;
	protected MobilityBoard<T> mobilityBoard = null;
	protected RandomGenerator<T> randomGenerator = null;
	protected Integer horizontalSize = null;
	protected Integer verticalSize = null; 
	protected T defaultValue = null;
	protected BoardInitializable<T> boardInitializer = null;
	
	@Override
	public BoardBuilder<T> setBoardIO(BoardFileIO<T> boardIO)
	{
		this.boardIO = boardIO;
		return this;
	}
	
	@Override
	public BoardBuilder<T> setMatrix(Matrix2<T> matrix)
	{
		this.matrix = matrix;
		return this;
	}
	
	@Override
	public BoardBuilder<T> setRandomGenerator(RandomGenerator<T> randomGenerator)
	{
		this.randomGenerator = randomGenerator;
		return this;
	}
	
	@Override
	public BoardBuilder<T> setMobilityBoard(MobilityBoard<T> mobilityBoard)
	{
		this.mobilityBoard = mobilityBoard;
		return this;
	}
	
	@Override
	public BoardBuilder<T> setHorizontalSize(int horizontalSize)
	{
		this.horizontalSize = horizontalSize;
		return this;
	}
	
	@Override
	public BoardBuilder<T> setVerticalSize(int verticalSize)
	{
		this.verticalSize = verticalSize;
		return this;
	}
	
	@Override
	public BoardBuilder<T> setDefaulValue(T defaultValue)
	{
		this.defaultValue = defaultValue;
		return this;
	}
	
	@Override
	public BoardBuilder<T> setBoardInitializable(BoardInitializable<T> boardInitializer)
	{
		this.boardInitializer = boardInitializer;
		return this;
	}
}