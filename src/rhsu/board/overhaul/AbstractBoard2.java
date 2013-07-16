package rhsu.board.overhaul;

import java.util.HashSet;
import rhsu.board.Board;
import rhsu.board.implementations.StringBoard;

/**
 *
 * @author rhsu
 */
public abstract class AbstractBoard2<T> implements Board<T>
{	
	protected class AbstractPiece2<T>
	{
		private int horizontal;
		private int vertical;
		private T t;
		
		//<editor-fold defaultstate="collapsed" desc="ACCESSORS">
		/**
		* @return the horizontal index
		*/
		public int getHorizontal()
		{
			return this.horizontal;
		}

		/**
		 * 
		 * @return the vertical index
		 */
		public int getVertical()
		{
			return this.vertical;
		}

		/**
		 * 
		 * @return the object itself
		 */
		public T getType()
		{
			return t;
		}

		/**
		 * Modifies the object to be the same as the parameter
		 * @param t the value to change into
		 */
		public void setType(T t)
		{
			this.t = t;
		}
		//</editor-fold>
		
		public AbstractPiece2(int i, int j, T t)
		{
			this.horizontal = i;
			this.vertical = j;
			this.t = t;
		}
		
		@Override
		public String toString()
		{
			return t.toString();
		}
	}
	
	/**
	 * the board object to allocate in the constructor
	 */
	protected AbstractPiece2<T>[][] board;
	/**
	 * The horizontal size of the board
	 */
	protected int horizontal_size;
	/**
	 * The vertical size of the board
	 */
	protected int vertical_size;
	
	public AbstractPiece2<T> pieceAt2(int i, int j)
	{
		return board[i][j];
	}
	
	public T getTypeAt(int i, int j)
	{
		return board[i][j].getType();
	}
	
	public void setTypeAt(int i, int j, T t)
	{
		board[i][j].setType(t);
	}
	
	public AbstractBoard2(int h, int v)
	{
		horizontal_size = h;
		vertical_size = v;
	}
	
	//<editor-fold defaultstate="collapsed" desc="BOARD">
	@Override
	public T getLeftPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getLeftPiece(Object p) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getRightPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getRightPiece(Object p) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getDownPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public T getDownPiece(Object p) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getUpPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getUpPiece(Object p) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T pieceAt(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public int getHorizontal_size() 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public int getVertical_size() 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void convertFromStringBoard(StringBoard baseBoard) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	//</editor-fold>
}
