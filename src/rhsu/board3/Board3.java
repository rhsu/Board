package rhsu.board3;

import rhsu.board.Direction;

/**
 * 3rd Generation of the Board Project
 * @param <T> The type parameter
 */
public interface Board3<T>
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
	
	//</editor-fold>
	
	//<editor-fold desc="Value Setter Methods" defaultstate="collapsed">
	
	/**
	 * Sets the value of the piece at the coordinate (horizontal, vertical)
	 * @param horizontal the horizontal index
	 * @param vertical the vertical index
	 * @param value the value of the piece to set
	 */
	public void setValueAt(int horizontal, int vertical, T value);	
	
	//</editor-fold>
}
