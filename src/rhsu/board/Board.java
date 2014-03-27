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
	
	public T getDefaultValue();
	
	//</editor-fold>
	
	//<editor-fold desc="Piece Retrieval Methods" defaultstate="collapsed">
	
	/**
	 * Returns the piece at the specified location 
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @return the piece at the coordinate (horizontal, vertical)
	 */
	public BoardPiece<T> getPieceAt(int horizontal, int vertical);	
	public BoardPiece<T> getPieceAt(int horizontal, int vertical, Direction direction, int units);
	public BoardPiece<T> getPieceAt(BoardPiece<T> piece, Direction direction, int units);
	
	//</editor-fold>
	
	//<editor-fold desc="Value Retrieval Methods" defaultstate="collapsed">
	
	/**
	 * Method for retrieving a value at the given coordinate
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @return the value of the piece at the coordinate (horizontal, vertical)
	 */
	public T getValueAt(int horizontal, int vertical);
	public T getValueAt(int horizontal, int vertical, Direction direction, int units);
	public T getValueAt(BoardPiece<T> piece, Direction direction, int units);
	/**
	 * Sets the value of the piece at the coordinate (horizontal, vertical)
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param value the value of the piece to set
	 */
	public void setValueAt(int horizontal, int vertical, T value);	
	
	//</editor-fold>
	
	//<editor-fold desc="Piece Setting Methods" defaultstate="collpased">
	
	/**
	 * modifies the piece at the given horizontal and vertical location to have the given value
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param value the value of the piece to set
	 */
	public void setPieceAt(int horizontal, int vertical, T value);
	
	/**
	 * modifies the piece at the given horizontal and vertical location to be the parameter piece
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param piece the piece to set at that location
	 */
	public void setPieceAt(int horizontal, int vertical, BoardPiece<T> piece);
	
	//</editor-fold>
	
	/**
	 * finds the first instance of the parameter value
	 * @param value the value to find within the board
	 * @return the first instance of the found value
	 */
	public BoardPiece<T> find(T value);
	
	/**
	 * finds all the values of the parameter value
	 * @param value the value to find within the board
	 * @return a collection of the found value
	 */
	public List<BoardPiece<T>> findAll(T value);
	
	/**
	 * constructs an iterator to iterate through the board
	 * @return an iterator object
	 */
	public Iterator<BoardPiece<T>> iterBoard();
	
	/**
	 * constructs a RandomGenerator to retrieve a random value within the bounds of the given parameter.
	 * @return a RandomGenerator object
	 */
	public RandomGenerator<T> randomGenerator();
	
	/**
	 * moves the parameter piece to the given coordinate (horizontal, vertical)
	 * @param piece the parameter piece to move
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @return a boolean value to denote if the move was successful
	 */
	public boolean move(BoardPiece<T> piece, int horizontal, int vertical);
	
	/**
	 * moves the parameter piece to the given coordinate horizontal, vertical) on the other board
	 * @param piece the parameter piece to move
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param otherBoard the other board to move to
	 * @return a boolean value to denote if the move was successful
	 */
	public boolean move(BoardPiece<T> piece, int horizontal, int vertical, Board<T> otherBoard);
	
	/**
	 * moves the parameter piece a specified number of units in the given direction
	 * @param piece the parameter piece to move
	 * @param units the number of units to move
	 * @param direction the direction to move towards
	 * @return a boolean value to denote if the move was successful
	 */
	public boolean move(BoardPiece<T> piece, int units, Direction direction);
	
	/**
	 * moves the parameter piece a specified number of units in the given direction on the other board
	 * @param piece the parameter piece to move
	 * @param units the number of units to move
	 * @param direction the direction to move towards
	 * @param otherBoard the other board to move to
	 * @return a boolean value to denote if the move was successful
	 */
	public boolean move(BoardPiece<T> piece, int units, Direction direction, Board<T> otherBoard);
}