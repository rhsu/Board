package rhsu.compositeBoard;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.random.RandomBoard;

public interface CompositeBoard
{
	public Board2 getBoardCore();
	
	public BoardIO getBoardIO();
	public Matrix getMatrix();
	public MobilityBoard getMobilityBoard();
	public RandomBoard getRandomBoard();
}
