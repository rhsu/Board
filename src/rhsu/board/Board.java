package rhsu.board;

/**
 *
 * @author RHsu
 */
public interface Board<T>
{
	public Object pieceAt(int i, int j);
	
	/**
	 * 
	 * @param i horizontal index
	 * @param j vertical index
	 * @return The piece to the left of the given index
	 */
	public Object getLeftPiece(int i, int j);
	
	/**
	 * 
	 * @param p Piece
	 * @return The piece to the left of the given piece
	 */
	public Object getLeftPiece(Object p);	
	
	/**
	 * 
	 * @param p Piece
	 * @return The piece to the left of the given piece
	 */
	public Object getRightPiece(int i, int j);
	
	/**
	 * 
	 * @param p Piece
	 * @return The piece to the right of the given piece
	 */
	public Object getRightPiece(Object p);
	
	/**
	 * @param p piece
	 * @return The piece below the given piece
	 */
	public Object getDownPiece(int i, int j);
	
	/**
	 * 
	 * @param p piece
	 * @return The piece above the given piece
	 */
	public Object getDownPiece(Object p);
	
	/**
	 * 
	 * @param i horizontal index
	 * @param j vertical index
	 * @return The piece above the given index
	 */
	public Object getUpPiece(int i, int j);
	
	/**
	 * 
	 * @param p piece
	 * @return The piece above the given piece
	 */
	public Object getUpPiece(Object p);
		
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
}

