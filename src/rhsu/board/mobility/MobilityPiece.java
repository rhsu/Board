package rhsu.board.mobility;

import rhsu.board.BoardPiece;

public interface MobilityPiece<T> extends BoardPiece<T>
{
	/**
	 * moves the piece to the specified coordinates
	 * @param horizontal the horizontal coordinate
	 * @param vertical the vertical coordinate
	 * @return a boolean value on whether the move was successful. Moving to self is considered unsuccessful since no move was made
	 */
	public boolean move(int horizontal, int vertical);
	
	/**
	 * moves the piece to the specified coordinates on the specified board
	 * @param horizontal
	 * @param vertical
	 * @param board
	 * @return 
	 */
	public boolean move(int horizontal, int vertical, MobilityBoard board);
}
