package rhsu.board.gameObjects;

import java.util.ArrayList;
import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;

/**
 *
 * @author rhsu
 */
public class Drop7Board extends AbstractBoard<Drop7Piece>
{
	public Drop7Board(int h, int v)
	{
		this(h, v, Drop7Piece.EMPTY);
	}
	
	public Drop7Board(int h, int v, Drop7Piece defaultValue)
	{
		super(h, v, defaultValue);
	}
	
	/**
	* calculates the number of adjacent pieces in the same (horizontal) row as a
	* given parameter piece (Including itself: e.g. A piece with no pieces next to it
	* will return a value of 1)
	* @param p the parameter piece to perform the calculation on
	* @return the number of pieces that are in the same row as the parameter piece.
	*/
	public int getNumberRowAdjacent(BoardPiece<Drop7Piece> piece)
	{
		if((piece == null) || (piece.getValue() == Drop7Piece.EMPTY))
		{
			return 0;
		}
		
		BoardPiece<Drop7Piece> current = piece;
		int numAdjacent = 0;
		
		//Check Left
		while((this.getLeftPiece(current) != null)
			&& (this.getLeftValue(current) != Drop7Piece.EMPTY))
		{
			numAdjacent++;
			current = this.getLeftPiece(current);
		}
			
		//Reset
		current = piece;
		
		//Check Right
		while((this.getRightPiece(current) != null)
			&& (this.getRightValue(current) != Drop7Piece.EMPTY))
		{
			numAdjacent++;
			current = this.getRightPiece(current);
		}
		
		return	++numAdjacent; //increment to include self;
	}
	
	/**
	* calculates the number of adjacent pieces in the same (vertical) column as a
	* given parameter piece (Including itself: e.g. A piece with no pieces next to it
	* will return a value of 1)
	* @param p the parameter piece to perform the calculation on
	* @return the number of pieces that are in the same column as the parameter piece.
	*/
	public int getNumberColumnAdjacent(BoardPiece<Drop7Piece> piece)
	{
		if((piece == null) || (piece.getValue() == Drop7Piece.EMPTY))
		{
			return 0;
		}
		
		BoardPiece<Drop7Piece> current = piece;
		int numAdjacent = 0;
		
		//Check up
		while((this.getUpPiece(current) != null)
			&& (this.getUpValue(piece) != Drop7Piece.EMPTY))
		{
			numAdjacent++;
			current = this.getUpPiece(current);
		}
		
		//reset
		current = piece;
		
		//Check down
		while((this.getDownPiece(current) != null)
			&& (this.getDownValue(current) != Drop7Piece.EMPTY))
		{
			numAdjacent++;
			current = this.getDownPiece(current);
		}
		
		return ++numAdjacent; //increment to include self
	}
	
	/**
	* @param p The piece to perform the method on
	* @return A list of pieces that are in the same column as the parameter piece
	*/
	public ArrayList<BoardPiece<Drop7Piece>> getAllPiecesInColumn(BoardPiece<Drop7Piece> piece)
	{
		if(piece == null)
		{
			throw new NullPointerException();
		}
		
		int column = piece.getVertical();
		
		ArrayList<BoardPiece<Drop7Piece>> pieces = new ArrayList<>();
			
		for(int i = 0; i < 7; i++)
		{
			BoardPiece<Drop7Piece> current = this.pieceAt(i, column);
			
			if((current != null) && (current.getValue() != Drop7Piece.EMPTY))
			{
				pieces.add(current);
			}
		}
	
		return pieces;
	}
				
	public ArrayList<BoardPiece<Drop7Piece>> getAllPiecesInRow(BoardPiece<Drop7Piece> piece)
	{
		if(piece == null)
		{
			throw new NullPointerException();
		}
		
		int row = piece.getHorizontal();
		
		ArrayList<BoardPiece<Drop7Piece>> pieces = new ArrayList<>();
		
		for(int i = 0; i < 7; i++)
		{
			BoardPiece<Drop7Piece> current = this.pieceAt(row, i);
			
			if((current != null) && (current.getValue() != Drop7Piece.EMPTY))
			{
				pieces.add(current);
			}
		}
		
		return pieces;
	}
	
	/**
	* @return A list of pieces that are marked as remove
	*/
	public ArrayList<BoardPiece<Drop7Piece>> getAllRemovePieces()
	{
		ArrayList<BoardPiece<Drop7Piece>> pieces = new ArrayList<>();

		for(int i = 0; i < 7; i++)
		{
			for(int j = 0; j < 7; j++)
			{
				BoardPiece<Drop7Piece> piece = this.pieceAt(i, j);
				
				if(piece.getValue().checkRemove())
				{
					pieces.add(piece);
				}
			}
		}
		return pieces;
	}
	
	public void checkForRemoval(BoardPiece<Drop7Piece> piece)
	{
		ArrayList<BoardPiece<Drop7Piece>> rows = this.getAllPiecesInRow(piece);
		//TODO: For Columns also 
		//ArrayList<BoardPiece<Drop7Piece>> columns = this.getAllPiecesInColumn(piece);
		
		for(BoardPiece<Drop7Piece> item: rows)
		{
			int value = item.getValue().getPieceValue();
			
			if(value == this.getNumberColumnAdjacent(item))
			{
				item.getValue().setRemove();
			}
		}
		
		removePieces();
	}
	
	private void removePieces()
	{
		ArrayList<BoardPiece<Drop7Piece>> removePieces = this.getAllRemovePieces();
		
		for(BoardPiece<Drop7Piece> item : removePieces)
		{
			item.setValue(Drop7Piece.EMPTY);
			item.getValue().setEmpty();
		}
	}
	
	/**
	 * Given a position, this function will create a new piece and update the piece
	 * If the insert is successful, then a check will be performed to determine if 
	 * @param position The column number to insert the piece. Do not use with array indexes
	 * @param value 
	 * @return True if the insert was successful, else returns false
	 * @throws IllegalArgumentException If an incorrect position or value is given+
	 */
	public boolean insert(int position, int value)
	{
		if((position < 1) || (position > 7) || (value > 8))
		{
			throw new IllegalArgumentException();
		}
		
		//subtracting one to calibrate the position to work with array indexes
		position--;
		
		for (int index = 6; index >= 0; index--)
		{
			BoardPiece<Drop7Piece> current = this.pieceAt(index, position);
			
			if(current.getValue() == Drop7Piece.EMPTY)
			{
				current.setValue(Drop7Piece.SET);
				current.getValue().setTypeValue(value);
				current.getValue().setPieceValue(0);
				return true;
			}
		}
		return false;
	}
}
