package rhsu.compositeBoard;

import rhsu.board.io.BoardIO;
import rhsu.board2.random.RandomBoard;

public class BoardBuilder<T>
{
	private BoardIO boardIO = null;
	private Matrix<T> matrix = null;
	private MobilityBoard<T> mobilityBoard = null;
	private RandomBoard<T> randomBoard = null;
	private Integer horizontalSize = null;
	private Integer verticalSize = null; 
	
	
	public BoardBuilder<T> setBoardIO(BoardIO boardIO)
	{
		this.boardIO = boardIO;
		return this;
	}
	
	public BoardBuilder<T> setMatrix(Matrix<T> matrix)
	{
		this.matrix = matrix;
		return this;
	}
	
	public BoardBuilder<T> setRandomBoard(RandomBoard<T> randomBoard)
	{
		this.randomBoard = randomBoard;
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
	
	public CompositeBoard<T> createBoard()
	{
		return new CompositeBoardImpl(
			this.horizontalSize,
			this.verticalSize,
			this.boardIO,
			this.matrix,
			this.mobilityBoard,
			this.randomBoard);
	}
}
