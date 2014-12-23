package rhsu.board2;

import rhsu.board2.boardModules.boardFileIO.BoardFileIO;
import rhsu.board2.boardModules.matrices.Matrix2;
import rhsu.board2.boardModules.mobility.MobilityBoard;
import rhsu.board2.boardModules.randomGenerators.RandomGenerator;

public abstract class AbstractBoard<T> implements Board2<T>
{
	protected final BoardFileIO boardIO;
	protected final Matrix2<T>matrix;
	protected final MobilityBoard<T> mobilityBoard;
	protected final RandomGenerator<T> randomGenerator;
	protected final BoardInitializable<T> boardInitializer;
	protected int horizontalSize;
	protected int verticalSize;
	protected int size;
	protected T defaultValue;
	
	@Override
	public BoardFileIO getBoardIO() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix2<T> getMatrix() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public MobilityBoard<T> getMobilityBoard() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public RandomGenerator<T> getRandomGenerator() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int getHorizontalSize() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int getVerticalSize() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int getSize() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public T getDefaultValue() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	public AbstractBoard(Integer horizontalSize,
		Integer verticalSize,
		BoardFileIO boardIO,
		Matrix2<T> matrix,
		MobilityBoard<T> mobilityBoard,
		RandomGenerator<T> randomGenerator,
		T defaultValue,
		BoardInitializable<T> boardInitializer)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.boardIO = boardIO;
		this.matrix = matrix;
		this.mobilityBoard = mobilityBoard;
		this.randomGenerator = randomGenerator;
		this.defaultValue = defaultValue;
		this.boardInitializer = boardInitializer;
	}
}
