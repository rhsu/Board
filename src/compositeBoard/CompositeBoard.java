package compositeBoard;

import rhsu.board2.Board2;

public interface CompositeBoard
{
	public Board2 getBoardCore();
	
	public BoardIO getBoardIO();
	public Matrix getMatrix();
	public MobilityBoard getMobilityBoard();
	public RandomBoard getRandomBoard();
}
