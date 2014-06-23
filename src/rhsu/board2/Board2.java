package rhsu.board2;

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
	
	public BoardPiece2<T>[][] getBoardArray();
	
	//</editor-fold>
	
	public BoardPiece2<T> getPieceAt(int horizontalIndex, int verticalIndex);

	public void initializeBoardArray();
}
