package rhsu.compositeBoard;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.matrix.Matrix2;
import rhsu.board2.random.RandomBoard;

public class CompositeBoardImpl<T> implements CompositeBoard<T>
{
	private final Board2<T> boardCore;
	private final BoardIO boardIO;
	private final Matrix2<T>matrix;
	private final MobilityBoard<T> mobilityBoard;
	private final RandomBoard<T> randomBoard;
	
	@Override
	public Board2<T> getBoardCore() { return this.boardCore; }

	@Override
	public BoardIO getBoardIO() { return this.boardIO; }

	@Override
	public Matrix2<T> getMatrix() { return this.matrix; }

	@Override
	public MobilityBoard<T> getMobilityBoard()	{ return this.mobilityBoard; }

	@Override
	public RandomBoard<T> getRandomBoard() { return this.randomBoard; }
		
	public CompositeBoardImpl(
		Board2<T> boardCore,
		BoardIO boardIO,
		Matrix2<T> matrix,
		MobilityBoard<T> mobilityBoard,
		RandomBoard<T> randomBoard)
	{
		this.boardCore = boardCore;
		this.boardIO = boardIO;
		this.matrix = matrix;
		this.mobilityBoard = mobilityBoard;
		this.randomBoard = randomBoard;
	}
}
