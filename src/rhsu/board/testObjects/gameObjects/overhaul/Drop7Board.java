package rhsu.board.testObjects.gameObjects.overhaul;

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
	
	//getAllPiecesInColumn
	
	//getAllPiecesInRow
	
	//getAllMarkedAsRemoved
	
	//checkForRemoval
	
	//removeMarked
	
	//insert
}
