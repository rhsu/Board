package rhsu.board2;

import java.util.Iterator;
import java.util.List;
import rhsu.board2.mobility.MobilityBoard;
import rhsu.board2.randomGenerators.RandomGenerator;
import rhsu.board2.matrices.Matrix2;
import rhsu.board.Direction;
import rhsu.board2.boardIO.Board2IO;

public interface Board2<T>
{	
	//<editor-fold desc="Accessors" defaultstate="collapsed">

	/**
	 * Method for retrieving the horizontal capacity of the board
	 * @return the horizontal size of the board
	 */
	public int getHorizontalSize();

	/**
	 * Method for retrieving the horizontal capacity of the board
	 * @return the vertical size of the board
	 */
	public int getVerticalSize();

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

	/**
	 * Method for returning in inner representation of the Board. The return type is an object because it can be either
	 * a linked structure or an array
	 * @return the inner representation of the board
	 */
	public Object getInnerBoardRepresentation();

	//</editor-fold>
	
	//<editor-fold desc="Modules" defaultstate="collapsed">

	public List<BoardModule<T>> getBoardModules();
	public Board2IO<T> getBoardIO();
	public Matrix2<T> getMatrix();
	public MobilityBoard<T> getMobilityBoard();
	public RandomGenerator<T> getRandomGenerator();
	
	//</editor-fold>
	
	//<editor-fold desc="Piece Retrieval Methods" defaultstate="collapsed">
	
	/**
	 * Returns the piece at the specified coordinates 
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @return the piece at the coordinate (horizontal, vertical)
	 */
	public BoardPiece2<T> getPieceAt(int horizontal, int vertical);	
	
	/**
	 * Returns the piece to the specified direction relative to the specified coordinates
	 * The piece will also be a given number of units away. If the number of units is negative, the direction will be reversed. For example, a negative left will move right
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param direction the direction to check
	 * @param units the number of units to move to
	 * @return a piece units away in the specified direction away from the given coordinate
	 */
	public BoardPiece2<T> getPieceAt(int horizontal, int vertical, Direction direction, int units);
	
	/**
	 * Returns the piece to the specified direction relative to the specified piece
	 * The return piece will also be a given number of units away. If the number of units is negative, the direction will be reversed. For example, a negative left will move right
	 * @param piece
	 * @param direction
	 * @param units
	 * @return 
	 */
	public BoardPiece2<T> getPieceAt(BoardPiece2<T> piece, Direction direction, int units);
	
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
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param direction the relative direction to get from
	 * @param units the number of units
	 * @return the value of the piece at the coordinate (horizontal, vertical) at a number of units away
	 */
	public T getValueAt(int horizontal, int vertical, Direction direction, int units);
	
	/***
	 * Method for retrieving a value to the specified direction relative to the given coordinate
	 * @param piece the coordinates of the parameter piece to retrieve from
	 * @param direction the relative direction to get from
	 * @param units the number of units
	 * @return the value of the piece at the parameter pieces coordinate.
	 */
	public T getValueAt(BoardPiece2<T> piece, Direction direction, int units);
	
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
	public void setPieceAt(int horizontal, int vertical, BoardPiece2<T> piece);
	
	//</editor-fold>
	
	public BoardPiece2<T> find(T value);
	
	public List<BoardPiece2<T>> findAll(T value);
	
	public Iterator<BoardPiece2<T>> boardIterator();
}
