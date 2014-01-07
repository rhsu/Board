package rhsu.board.mobility;

import rhsu.board.BoardPiece;

public interface MobilityPiece<T> extends BoardPiece<T>
{
	/**
	 * Moves this piece to a new horizontal and vertical location
	 * @param horizontal
	 * @param vertical
	 * @return true or false, whether the move was successful
	 */
	public boolean move(int horizontal, int vertical);
}
