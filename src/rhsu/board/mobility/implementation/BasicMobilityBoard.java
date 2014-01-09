package rhsu.board.mobility.implementation;

import rhsu.board.AbstractBoard;
import rhsu.board.RandomGenerator;
import rhsu.board.mobility.MobilityBoard;
import rhsu.board.mobility.MobilityPiece;
import rhsu.board.mobility.MobilityStatus;

public class BasicMobilityBoard<T> extends AbstractBoard<T> 
	implements MobilityBoard<T>
{
	@SuppressWarnings({"unchecked"})
	public BasicMobilityBoard(int horizontal, int vertical, T defaultValue)
	{
		this.horizontal_size = horizontal;
		this.vertical_size = vertical;
		this.size = horizontal * vertical;
		this.board = new BasicMobilityPiece[horizontal][vertical];
		
		for(int i = 0; i < horizontal; i++)
		{
			for(int j = 0; j < vertical; j++)
			{
				this.board[i][j] = new BasicMobilityPiece(i, j, defaultValue);
			}
		}
	}
	
	@Override
	public RandomGenerator<T> randomGenerator() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean move(MobilityPiece<T> piece, int horizontal, int vertical) 
	{
		MobilityPiece<T> other = (MobilityPiece<T>) this.pieceAt(horizontal, vertical);
		
		if(other == null) return false;
		
		if(other.getStatus() != MobilityStatus.Free) return false;
		
		MobilityPiece<T> temp = piece;
		piece.copy(other);
		other.copy(temp);
		
		return true;
	}

	@Override
	public boolean move(MobilityPiece<T> piece, int horizontal, int vertical, MobilityBoard board) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
