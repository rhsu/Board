package rhsu.compositeBoard;

import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.Matrix2;
import rhsu.board2.random.RandomBoard;

public interface CompositeBoard<T>
{
	public Board2<T> getBoardCore();
	
	public BoardIO getBoardIO();
	public Matrix2<T> getMatrix();
	public MobilityBoard<T> getMobilityBoard();
	public RandomBoard<T> getRandomBoard();
}
