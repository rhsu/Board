package rhsu.board;

import java.util.List;

/**
 * The root interface in the board hierarchy. This interface contains definitions for finding a specific piece on a 2-Dimensional array.
 * @param <T> The type of the board
 */
public interface Board<T>
{
	/**
	 * Returns the piece at the location specified
	 * @param i horizontal index
	 * @param j vertical index
	 * @return the piece at the coordinate (i, j)
	 */
	public BoardPiece<T> pieceAt(int i, int j);
	
	/**
	 * Method for retrieving the piece left of (i, j)
	 * @param i  the horizontal index
	 * @param j the vertical index
	 * @return the left piece of (i, j). returns null if invalid location
	 */
	public BoardPiece<T> getLeftPiece(int i, int j);
	
	/**
	 * Method for retrieving the piece left of p
	 * @param p the piece to check
	 * @return the piece left of p. returns null if invalid location
	 */
	public BoardPiece<T> getLeftPiece(BoardPiece<T> p);	
	
	/**
	 * Method for retrieving the piece right of (i, j)
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @return the piece right of (i, j). returns null if invalid location
	 */
	public BoardPiece<T> getRightPiece(int i, int j);
	
	/**
	 * Method for retrieving the piece right of p
	 * @param p the piece to check
	 * @return The piece right of p. Returns null if invalid location
	 */
	public BoardPiece<T> getRightPiece(BoardPiece<T> p);
	
	/**
	 * Method for retrieving the piece below the given index (i, j)
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @return The piece below the piece at (i, j);
	 */
	public BoardPiece<T> getDownPiece(int i, int j);
	
	/**
	 * Method for retrieving the piece below p
	 * @param p the piece to check
	 * @return the piece below the given piece
	 */
	public BoardPiece<T> getDownPiece(BoardPiece<T> p);
	
	/**
	 * Method for retrieving the piece above the given index (i, j)
	 * @param i horizontal index
	 * @param j vertical index
	 * @return the piece above the given index (i, j)
	 */
	public BoardPiece<T> getUpPiece(int i, int j);
	
	/**
	 * Method for retrieving the piece above p
	 * @param p the piece to check
	 * @return the piece above the given piece
	 */
	public BoardPiece<T> getUpPiece(BoardPiece<T> p);
	
	/**
	 * Method for retrieving a value at the coordinate (i, j)
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @return the value of the piece at the coordinate (i, j)
	 */
	public T getValueAt(int i, int j);
	
	/**
	 * Sets the value of a piece by specifying a coordinate (i, j)
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @param t the value of the piece to set
	 */
	public void setValueAt(int i, int j, T t);	
	
	/**
	 * Method for retrieving the horizontal capacity of the board
	 * @return the horizontal size of the board
	 */
	public int getHorizontal_size();
	
	/**
	 * Method for retrieving the horizontal capacity of the board
	 * @return the vertical size of the board
	 */
	public int getVertical_size();
	
	public int getSize();
	
	public T getLeftValue(BoardPiece<T> p);
	
	public T getLeftValue(int i, int j);
	
	public T getRightValue(BoardPiece<T> p);
	
	public T getRightValue(int i, int j);
	
	public T getUpValue(BoardPiece<T> p);
	
	public T getUpValue(int i, int j);	
	
	public T getDownValue(BoardPiece<T> p);
	
	public T getDownValue(int i, int j);
	
	public BoardPiece<T> find(T t);
	
	public List<BoardPiece<T>> findAll(T t);
}

