package rhsu.compositeBoard;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.random.RandomBoard;

public class BoardBuilder
{
	private Board2 boardCore = null;
	private BoardIO boardIO = null;
	private Matrix matrix = null;
	private MobilityBoard mobilityBoard = null;
	private RandomBoard randomBoard = null;
	
	public BoardBuilder setBoardCore(Board2 boardCore)
	{
		this.boardCore = boardCore;
		return this;
	}
	
	public BoardBuilder setBoardIO(BoardIO boardIO)
	{
		this.boardIO = boardIO;
		return this;
	}
	
	public BoardBuilder setMatrix(Matrix matrix)
	{
		this.matrix = matrix;
		return this;
	}
	
	public BoardBuilder setRandomBoard(RandomBoard randomBoard)
	{
		this.randomBoard = randomBoard;
		return this;
	}
	
	public BoardBuilder setMobilityBoard(MobilityBoard mobilityBoard)
	{
		this.mobilityBoard = mobilityBoard;
		return this;
	}
	
	public CompositeBoard createBoard()
	{
		return new CompositeBoardImpl(
			this.boardCore,
			this.boardIO,
			this.matrix,
			this.mobilityBoard,
			this.randomBoard);
	}
}
