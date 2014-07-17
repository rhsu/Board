package rhsu.compositeBoard;

import rhsu.board.io.BoardIO;
import rhsu.board2.random.RandomBoard;

public class BoardConfigurator
{
	private BoardIO boardIO = null;
	private Matrix matrix = null;
	private MobilityBoard mobilityBoard = null;
	private RandomBoard randomBoard = null;
	private Integer horizontalSize = null;
	private Integer verticalSize = null; 
	
	
	public BoardConfigurator setBoardIO(BoardIO boardIO)
	{
		this.boardIO = boardIO;
		return this;
	}
	
	public BoardConfigurator setMatrix(Matrix matrix)
	{
		this.matrix = matrix;
		return this;
	}
	
	public BoardConfigurator setRandomBoard(RandomBoard randomBoard)
	{
		this.randomBoard = randomBoard;
		return this;
	}
	
	public BoardConfigurator setMobilityBoard(MobilityBoard mobilityBoard)
	{
		this.mobilityBoard = mobilityBoard;
		return this;
	}
	
	public BoardConfigurator setHorizontalSize(int horizontalSize)
	{
		this.horizontalSize = horizontalSize;
		return this;
	}
	
	public BoardConfigurator setVerticalSize(int verticalSize)
	{
		this.verticalSize = verticalSize;
		return this;
	}
	
	public CompositeBoard configureBoard()
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
