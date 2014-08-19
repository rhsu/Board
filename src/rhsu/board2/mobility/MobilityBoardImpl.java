package rhsu.board2.mobility;

import java.util.UUID;
import rhsu.board.Direction;
import rhsu.board2.BoardPiece2;
import rhsu.board2.CompositeBoard;

public class MobilityBoardImpl<T> implements MobilityBoard<T>
{
	private final CompositeBoard<T> parent;
	private final UUID uuid;
	
	public MobilityBoardImpl(CompositeBoard<T> parent)
	{
		this.parent = parent;
		this.uuid = UUID.randomUUID();
		this.initializeParentBoardPieces(parent);
	}
	
	private void initializeParentBoardPieces(CompositeBoard<T> parent)
	{
		BoardPiece2<T>[][] boardArray = parent.getBoardArray();
		
		for (int i = 0; i < parent.getHorizontalSize(); i++)
		{
			for (int j = 0; j < parent.getVerticalSize(); j++)
			{
				boardArray[i][j].setUUID(this.uuid);
				boardArray[i][j].setStatus(MobilityStatus.Free);
			}
		}
	}
	
	@Override
	public boolean move(BoardPiece2<T> piece, int horizontal, int vertical)
	{		
		BoardPiece2<T> target = (BoardPiece2<T>) parent.getPieceAt(horizontal, vertical);
		
		if (piece.getUUID() != this.getUUID()) return false;
		
		if(target == null) return false;
		
		if(target.getMobilityStatus() != MobilityStatus.Free) return false;
		
		int tempHorizontal = piece.getHorizontalIndex();
		int tempVertical = piece.getVerticalIndex();
		
		target.setValue(parent.getDefaultValue());	
		parent.setPieceAt(horizontal, vertical, piece);
		parent.setPieceAt(tempHorizontal, tempVertical, target);	
		
		return true;
	}

	@Override
	public boolean move(BoardPiece2<T> piece, int horizontal, int vertical, CompositeBoard<T> otherBoard)
	{
		BoardPiece2<T> target = otherBoard.getPieceAt(horizontal, vertical);
		
		if (piece.getUUID() != this.getUUID()) return false;
		
		if(target == null) return false;
		
		if(target.getMobilityStatus() != MobilityStatus.Free) return false;
		
		int tempHorizontal = piece.getHorizontalIndex();
		int tempVertical = piece.getVerticalIndex();
		
		target.setValue(this.parent.getDefaultValue());
		
		//swap the UUIDs
		UUID temp = target.getUUID();
		target.setUUID(piece.getUUID());
		piece.setUUID(temp);
		
		otherBoard.setPieceAt(horizontal, vertical, piece);
		this.parent.setPieceAt(tempHorizontal, tempVertical, target);
		
		return true;
	}

	@Override
	public boolean move(BoardPiece2<T> piece, int units, Direction direction)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean move(BoardPiece2<T> piece, int units, Direction direction, CompositeBoard<T> otherBoard)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public UUID getUUID() { return this.uuid; }
}
