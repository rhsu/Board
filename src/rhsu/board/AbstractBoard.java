package rhsu.board;

import rhsu.board.utilities.UtilityFunctions;

/**
 * The Abstract Board class is a custom made data-structure, which allows easy
 * access of "pieces" by retrieval functions.
 * @param <T> Generic Type. The type must extend Abstract Piece
 */
public abstract class AbstractBoard <T extends AbstractPiece> implements Board<T>
{
	/**
	 * the board object to allocate in the constructor
	 */
	protected T[][] board;
	/**
	 * The horizontal size of the board
	 */
	protected int horizontal_size;
	/**
	 * The vertical size of the board
	 */
	protected int vertical_size;
	
	//<editor-fold defaultstate="collapsed" desc="RETRIEVAL FUNCTIONS">
        
	/**
	 * 
	 * @param i horizontal index
	 * @param j vertical index
	 * @return The piece to the left of the given index
	 */
	@Override
	public T getLeftPiece(int i, int j)
	{		
		return pieceAt(i, j - 1);
	}
	
	/**
	 * 
	 * @param p Piece
	 * @return The piece to the left of the given piece
	 */
	@Override
	public T getLeftPiece(T p)
	{
		return pieceAt(p.getHorizontal(), p.getVertical() - 1);
	}
	
	/**
	 * 
	 * @param i horizontal index
	 * @param j vertical index
	 * @return The piece to the right of the given index
	 */
	@Override
	public T getRightPiece(int i, int j)
	{
		return pieceAt(i, j + 1);
	}
	
	/**
	 * 
	 * @param p Piece
	 * @return The piece to the right of the given piece
	 */
	@Override
	public T getRightPiece(T p)
	{
		return pieceAt(p.getHorizontal(), p.getVertical() + 1);
	}
	
	/**
	 * 
	 * @param i horizontal index
	 * @param j vertical index
	 * @return The piece above the given index
	 */
	@Override
	public T getUpPiece(int i, int j)
	{
		return pieceAt(i - 1, j);
	}
	
	/**
	 * 
	 * @param p piece
	 * @return The piece above the given piece
	 */
	@Override
	public T getUpPiece(T p)
	{
		return pieceAt(p.getHorizontal() - 1, p.getVertical());
	}
	
	/**
	 * 
	 * @param i horizontal index
	 * @param j vertical index
	 * @return The piece below the given index
	 */
	@Override
	public T getDownPiece(int i, int j)
	{
		return pieceAt(i + 1, j);
	}
	
	/**
	 * @param p piece
	 * @return The piece below the given piece
	 */
	@Override
	public T getDownPiece(T p)
	{
		return pieceAt(p.getHorizontal() + 1, p.getVertical());
	}
	
	/**
	 * Retrieves a Piece from the board with the given indices
	 * @param i horizontal index
	 * @param j vertical index
	 * @return The piece from the board. Null if no piece exists
	 */
	@Override
	public T pieceAt(int i, int j)
	{
		if (UtilityFunctions.isValidPosition(i, horizontal_size) && UtilityFunctions.isValidPosition(j, vertical_size)) 
		{
			return board[i][j];
		}
		return null;
	}
	
	/**
	 * Retrieves the underlying Object from the board with the given indices
	 * @param i horizontal index
	 * @param j vertical index
	 * @return The underlying Object from the board. Null if no object exists
	 */
	@Override
	public Object getTypeAt(int i, int j)
	{
		return this.pieceAt(i, j).getType();
	}

	/**
	 * Sets the type at the given indices
	 * @param i horizontal index
	 * @param j vertical index
	 */
	@Override
	public void setTypeAt(int i, int j, Object obj)
	{
		this.pieceAt(i,j).setType(obj);
	}
	
	//</editor-fold>
	
	/**
	 * To utilize this constructor, allocate a 2-dimensional array of objects that
	 * extends abstract piece. 
	 * 
	 * 
	 * <br/>
	 * Example usage:
	 * <pre>
	 * <code>
	 * for(int i = 0; i < 7; i++)
	 * {
	 *		for(int j = 0; j < 7; j++)<br/>
	 *		{
	 *			board = new StringPiece("ThisIsAString", i, j);<br/>
	 *		}
	 * }
	 * </code>
	 * </pre>
	 * 
	 * Some example implementations include:
	 * @see sampleImplementations.BooleanBoard
	 * @see sampleImplementations.CharBoard
	 * @see sampleImplementations.math.IntBoard
	 * @see sampleImplementations.math.DoubleBoard
	 * @see sampleImplementations.math.BigDecimalBoard
	 * @see sampleImplementations.math.BigIntegerBoard
	 * @see sampleImplementations.StringBoard
	 */
	public AbstractBoard(int i, int j)
	{
		horizontal_size = i;
		vertical_size = j;
	}
	
	@Override
	public int getHorizontal_size()
	{
		return horizontal_size;
	}
	
	@Override
	public int getVertical_size()
	{
		return vertical_size;
	}
	
	/**
	 * @return a string representation of the AbstractBoard object
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("==============").append("\n");
		for (int i = 0; i < horizontal_size; i++)
		{
			for (int j = 0 ; j < vertical_size; j++)
			{
				builder.append(pieceAt(i,j).toString()).append(" ");
			}
			builder.append("\n");
		}
		builder.append("==============");
		return builder.toString();
	}
}
