package rhsu.board2.mobility;

import java.util.UUID;
import rhsu.board.Board;
import rhsu.board.Direction;
import rhsu.board2.BoardPiece2;
import rhsu.board2.CompositeBoard;

public interface MobilityBoard<T>
{
	/**
	 * moves the parameter piece to the given coordinate (horizontal, vertical)
	 * @param piece the parameter piece to move
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @return a boolean value to denote if the move was successful
	 */
	public boolean move(BoardPiece2<T> piece, int horizontal, int vertical);
	
	/**
	 * moves the parameter piece to the given coordinate on the other board
	 * @param piece the parameter piece to move
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param otherBoard the other board to move to
	 * @return a boolean value to denote if the move was successful
	 */
	public boolean move(BoardPiece2<T> piece, int horizontal, int vertical, CompositeBoard<T> otherBoard);
	
	/**
	 * moves the parameter piece a specified number of units in the given direction
	 * @param piece the parameter piece to move
	 * @param units the number of units to move
	 * @param direction the direction to move towards
	 * @return a boolean value to denote if the move was successful
	 */
	public boolean move(BoardPiece2<T> piece, int units, Direction direction);
	
	/**
	 * moves the parameter piece a specified number of units in the given direction 
	 * to a different board
	 * @param piece the parameter piece to move
	 * @param units the number of units to move
	 * @param direction the direction to move towards
	 * @param otherBoard the other board to move to
	 * @return a boolean value to denote if the move was successful
	 */
	public boolean move(BoardPiece2<T> piece, int units, Direction direction, CompositeBoard<T> otherBoard);
	
	public UUID getUUID();
}
