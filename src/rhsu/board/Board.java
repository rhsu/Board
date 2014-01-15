package rhsu.board;

import java.util.Iterator;
import java.util.List;

/**
 * The root interface in the board hierarchy. This interface contains definitions for finding a specific piece on a 2-Dimensional array. Other functionality includes the ability to create an iterator for 1-Dimension traversal of the Board to trim computation time. In addition, a find and a findAll feature is included to allow quick searching.
 * The retrieval methods are separated into two types. One type returns the object wrapper itself (the board piece). The other returns the physical value. Use the GetPieceAt and similar methods when working with boardPieces and the GetValueAt and similar methods when working with values.
 * @param <T> The type of the board
 */
public interface Board<T>	
{
	//<editor-fold desc="Accessors" defaultstate="collapsed">
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
	
	/**
	 * Method for retrieving the total capacity of the board
	 * @return the total size of the board
	 */
	public int getSize();
	//</editor-fold>
	
	//<editor-fold desc="Piece Retrieval Methods" defaultstate="collapsed">
	/**
	 * Returns the piece at the location specified
	 * @param horizontal horizontal index
	 * @param vertical vertical index
	 * @return the piece at the coordinate (i, j)
	 */
	public BoardPiece<T> pieceAt(int horizontal, int vertical);
	
	/**
	 * Method for retrieving the board piece left of a given coordinate
	 * @param horizontal  the horizontal index
	 * @param vertical the vertical index
	 * @return the left piece of (i, j). returns null if invalid location
	 */
	public BoardPiece<T> getLeftPiece(int horizontal, int vertical);
	
	/**
	 * Method for retrieving the board piece left of the parameter piece
	 * @param piece the piece to check
	 * @return the piece left of p. returns null if invalid location
	 */
	public BoardPiece<T> getLeftPiece(BoardPiece<T> piece);	
	
	/**
	 * Method for retrieving the piece right of a given coordinate
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @return the piece right of (i, j). returns null if invalid location
	 */
	public BoardPiece<T> getRightPiece(int i, int j);
	
	/**
	 * Method for retrieving the board piece right of the parameter piece
	 * @param p the piece to check
	 * @return The piece right of p. Returns null if invalid location
	 */
	public BoardPiece<T> getRightPiece(BoardPiece<T> p);
	
	/**
	 * Method for retrieving the board piece below a given coordinate
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @return The piece below the piece at (i, j);
	 */
	public BoardPiece<T> getDownPiece(int i, int j);
	
	/**
	 * Method for retrieving the board piece below the parameter piece
	 * @param p the piece to check
	 * @return the piece below the given piece
	 */
	public BoardPiece<T> getDownPiece(BoardPiece<T> p);
	
	/**
	 * Method for retrieving the board piece above the given coordinate
	 * @param i horizontal index
	 * @param j vertical index
	 * @return the piece above the given index (i, j)
	 */
	public BoardPiece<T> getUpPiece(int i, int j);
	
	/**
	 * Method for retrieving the board piece above the parameter piece
	 * @param p the piece to check
	 * @return the piece above the given piece
	 */
	public BoardPiece<T> getUpPiece(BoardPiece<T> p);
	
	//</editor-fold>
	
	//<editor-fold desc="Value Retrieval Methods" defaultstate="collapsed">
	
	/**
	 * Method for retrieving a value at the given coordinate
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
	 * Method for retrieving the value of the piece left of the given piece
	 * @param p the board piece to check
	 * @return the value of the piece left of the parameter piece
	 */
	public T getLeftValue(BoardPiece<T> p);
	
	/**
	 * Method for retrieving the value of the piece left of the given coordinate
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @return the value of the piece left of the parameter coordinate
	 */
	public T getLeftValue(int i, int j);
	
	/**
	 * Method for retrieving the value of the piece right of the given piece
	 * @param p the board piece to check
	 * @return the value of the piece right of the parameter piece
	 */
	public T getRightValue(BoardPiece<T> p);
	
	/**
	 * Method for retrieving the value of the piece right of the given coordinate
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @return the value of the piece right of the parameter coordinate
	 */
	public T getRightValue(int i, int j);
	
	public T getUpValue(BoardPiece<T> p);
	
	public T getUpValue(int i, int j);	
	
	public T getDownValue(BoardPiece<T> p);
	
	public T getDownValue(int i, int j);
	
	//</editor-fold>
	
	public BoardPiece<T> find(T value);
	
	public List<BoardPiece<T>> findAll(T value);
	
	public Iterator<BoardPiece<T>> iterBoard();
	
	public RandomGenerator<T> randomGenerator();
	
	/**
	 * modifies the piece at the given horizontal and vertical location to have the given value
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param value the value of the piece to set
	 */
	public void modifyPieceAt(int horizontal, int vertical, T value);
	
	/**
	 * modifies the piece at the given horizontal and vertical location to be the parameter piece
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param piece the piece to set at that location
	 */
	public void modifyPieceAt(int horizontal, int vertical, BoardPiece<T> piece);
}