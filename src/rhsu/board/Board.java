package rhsu.board;

import rhsu.board.implementations.StringBoard;

/**
 *
 * @author RHsu
 */
public interface Board<T>
{
	public BoardPiece<T> pieceAt(int i, int j);
	
	/**
	 * 
	 * @param i horizontal index
	 * @param j vertical index
	 * @return The piece to the left of the given index
	 */
	public BoardPiece<T> getLeftPiece(int i, int j);
	
	/**
	 * 
	 * @param p Piece
	 * @return The piece to the left of the given piece
	 */
	public BoardPiece<T> getLeftPiece(BoardPiece<T> p);	
	
	/**
	 * 
	 * @param p Piece
	 * @return The piece to the left of the given piece
	 */
	public BoardPiece<T> getRightPiece(int i, int j);
	
	/**
	 * 
	 * @param p Piece
	 * @return The piece to the right of the given piece
	 */
	public BoardPiece<T> getRightPiece(BoardPiece<T> p);
	
	/**
	 * @param p piece
	 * @return The piece below the given piece
	 */
	public BoardPiece<T> getDownPiece(int i, int j);
	
	/**
	 * 
	 * @param p piece
	 * @return The piece above the given piece
	 */
	public BoardPiece<T> getDownPiece(BoardPiece<T> p);
	
	/**
	 * 
	 * @param i horizontal index
	 * @param j vertical index
	 * @return The piece above the given index
	 */
	public BoardPiece<T> getUpPiece(int i, int j);
	
	/**
	 * 
	 * @param p piece
	 * @return The piece above the given piece
	 */
	public BoardPiece<T> getUpPiece(BoardPiece<T> p);
		
	public T getTypeAt(int i, int j);
	
	public void setTypeAt(int i, int j, T t);	
	
	/**
	 * 
	 * @return the horizontal size of the board
	 */
	public int getHorizontal_size();
	
	/**
	 * 
	 * @return the vertical size of the board
	 */
	public int getVertical_size();
	
	/**
	 * Converts the current board into a board based off of values from the baseBoard
	 * @param baseBoard the board to convert from
	 */
	public void convertFromStringBoard(StringBoard baseBoard);
}

