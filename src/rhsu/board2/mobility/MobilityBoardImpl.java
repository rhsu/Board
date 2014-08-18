package rhsu.board2.mobility;

import rhsu.board.Board;
import rhsu.board.BoardPiece;
import rhsu.board.Direction;
import rhsu.board2.BoardPiece2;
import rhsu.board2.CompositeBoard;

public class MobilityBoardImpl<T> implements MobilityBoard<T>
{
	private CompositeBoard<T> parent;
	
	public MobilityBoardImpl(CompositeBoard<T> parent)
	{
		this.parent = parent;
	}
	
	@Override
	public boolean move(BoardPiece<T> piece, int horizontal, int vertical)
	{		
		BoardPiece2<T> target = (BoardPiece2<T>) parent.getPieceAt(horizontal, vertical);
		
		if (piece.getUUID() != parent.getUUID()) return false;
		
		if(target == null) return false;
		
		if(target.getMobilityStatus() != MobilityStatus.Free) return false;
		
		int tempHorizontal = piece.getHorizontal();
		int tempVertical = piece.getVertical();
		
		target.setValue(parent.getDefaultValue());	
		parent.setPieceAt(horizontal, vertical, piece);
		parent.setPieceAt(tempHorizontal, tempVertical, target);	
		
		return true;
	}

	@Override
	public boolean move(BoardPiece<T> piece, int horizontal, int vertical, Board<T> otherBoard)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean move(BoardPiece<T> piece, int units, Direction direction)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean move(BoardPiece<T> piece, int units, Direction direction, Board<T> otherBoard)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
