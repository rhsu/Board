package rhsu.board.mobility;

import rhsu.board.Board;

/**
 *
 * @author rhsu
 */
public interface MobilityBoard<T> extends Board<T>
{
	/**
	 * Moves a specified piece to a new horizontal and vertical location on the same board
	 * @param piece
	 * @param horizontal
	 * @param vertical
	 * @return a boolean representing whether the move was successful
	 */
	public boolean move(MobilityPiece<T> piece, int horizontal, int vertical);
	
	/**
	 * Moves a specified piece to a new horizontal and vertical location to a different board
	 * @param piece
	 * @param horizontal
	 * @param vertical
	 * @param board
	 * @return a boolean representing whether the move was successful
	 */
	public boolean move(MobilityPiece<T> piece, int horizontal, int vertical, MobilityBoard<T> board);
}
