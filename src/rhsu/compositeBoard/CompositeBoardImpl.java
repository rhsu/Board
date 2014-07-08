package rhsu.compositeBoard;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.random.RandomBoard;

public class CompositeBoardImpl<T> implements CompositeBoard<T>
{
	private final Board2 boardCore;
	private final BoardIO boardIO;
	private final Matrix matrix;
	private final MobilityBoard mobilityBoard;
	private final RandomBoard randomBoard;
	
	@Override
	public Board2 getBoardCore() { return this.boardCore; }

	@Override
	public BoardIO getBoardIO() { return this.boardIO; }

	@Override
	public Matrix getMatrix() { return this.matrix; }

	@Override
	public MobilityBoard getMobilityBoard()	{ return this.mobilityBoard; }

	@Override
	public RandomBoard getRandomBoard() { return this.randomBoard; }
	
	public CompositeBoardImpl(
		Board2 boardCore,
		BoardIO boardIO,
		Matrix matrix,
		MobilityBoard mobilityBoard,
		RandomBoard randomBoard)
	{
		this.boardCore = boardCore;
		this.boardIO = boardIO;
		this.matrix = matrix;
		this.mobilityBoard = mobilityBoard;
		this.randomBoard = randomBoard;
	}
}
