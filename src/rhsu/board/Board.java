package rhsu.board;

import rhsu.board2.RandomGenerator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * The root interface in the board hierarchy. This interface contains definitions for finding a specific piece on a 2-Dimensional array. Other functionality includes the ability to create an iterator for 1-Dimension traversal of the Board to trim computation time. In addition, a find and a findAll feature is included to allow quick searching.
 * The retrieval methods are separated into two types. One type returns the object wrapper itself (the board piece). The other returns the physical value. Use the getPieceAt and similar methods when working with boardPieces and the getValueAt and similar methods when working with values.
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
	
	/**
	 * Method for returning the default value. This is used to provide a filler value when an error occurs, or to provide a value when no value is submitted.
	 * @return the default value of the Board
	 */
	public T getDefaultValue();
	
	//</editor-fold>
	
	//<editor-fold desc="Piece Retrieval Methods" defaultstate="collapsed">
	
	/**
	 * Returns the piece at the specified coordinates 
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @return the piece at the coordinate (horizontal, vertical)
	 */
	public BoardPiece<T> getPieceAt(int horizontal, int vertical);	
	
	/**
	 * Returns the piece to the specified direction relative to the specified coordinates
	 * The piece will also be a given number of units away. If the number of units is negative, the direction will be reversed. For example, a negative left will move right
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param direction the direction to check
	 * @param units the number of units to move to
	 * @return a piece units away in the specified direction away from the given coordinate
	 */
	public BoardPiece<T> getPieceAt(int horizontal, int vertical, Direction direction, int units);
	
	/**
	 * Returns the piece to the specified direction relative to the specified piece
	 * The return piece will also be a given number of units away. If the number of units is negative, the direction will be reversed. For example, a negative left will move right
	 * @param piece
	 * @param direction
	 * @param units
	 * @return 
	 */
	public BoardPiece<T> getPieceAt(BoardPiece<T> piece, Direction direction, int units);
	
	//</editor-fold>
	
	//<editor-fold desc="Value Retrieval Methods" defaultstate="collapsed">
	
	/**
	 * Method for retrieving a value at the given coordinate
	 * The return value will also be a given number of units away. If the number of units is negative, the direction will be reversed. For example, a negative left will move right
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @return the value of the piece at the coordinate (horizontal, vertical)
	 */
	public T getValueAt(int horizontal, int vertical);
	
	/**
	 * Method for retrieving a value to the specified direction relative to the given coordinate
	 * @param horizontal
	 * @param vertical
	 * @param direction
	 * @param units
	 * @return 
	 */
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
	 * constructs a random generator to retrieve a random value 
	 * within the bounds of the given parameter 
	 * @return a Random Generator object
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
	 * moves the parameter piece to the given coordinate on the other board
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
	 * moves the parameter piece a specified number of units in the given direction 
	 * to a different board
	 * @param piece the parameter piece to move
	 * @param units the number of units to move
	 * @param direction the direction to move towards
	 * @param otherBoard the other board to move to
	 * @return a boolean value to denote if the move was successful
	 */
	public boolean move(BoardPiece<T> piece, int units, Direction direction, Board<T> otherBoard);
	
	public UUID getUUID();

	public String toOutputString(char delimiter);
}