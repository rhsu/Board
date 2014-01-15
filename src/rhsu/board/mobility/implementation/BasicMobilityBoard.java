package rhsu.board.mobility.implementation;

import rhsu.board.RandomGenerator;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board.mobility.MobilityBoard;
import rhsu.board.mobility.MobilityPiece;
import rhsu.board.mobility.MobilityStatus;

public class BasicMobilityBoard<T> extends AbstractBasicBoard<T> 
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
		MobilityPiece<T> target = (MobilityPiece<T>) this.pieceAt(horizontal, vertical);
		
		if(target == null) return false;
		
		if(target.getStatus() != MobilityStatus.Free) return false;
		
		int tempHorizontal = piece.getHorizontal();
		int tempVertical = piece.getVertical();
		
		//perform a swap.
		//this.board[horizontal][vertical] = piece;
		//this.board[piece.getHorizontal()][piece.getVertical()] = target;
		
		//update the indices
		//piece.setHorizontal(horizontal);
		//piece.setVertical(vertical);		
		//target.setHorizontal(tempHorizontal);
		//target.setVertical(tempVertical);
		
		this.modifyPieceAt(horizontal, vertical, piece);
		this.modifyPieceAt(tempHorizontal, tempVertical, target);
		
		return true;
	}

	@Override
	public boolean move(MobilityPiece<T> piece, int horizontal, int vertical, MobilityBoard<T> otherBoard) 
	{
		MobilityPiece<T> target = (MobilityPiece<T>) otherBoard.pieceAt(horizontal, vertical);
		
		if(target == null) return false;
		
		if(target.getStatus() != MobilityStatus.Free) return false;
		
		int tempHorizontal = piece.getHorizontal();
		int tempVertical = piece.getVertical();
		
		//perform a swap.
		//this.board[horizontal][vertical] = piece;
		//this.board[piece.getHorizontal()][piece.getVertical()] = target;
		
		this.board[horizontal][vertical] = piece;
		//otherBoard.
		
		
		//update the indices
		piece.setHorizontal(horizontal);
		piece.setVertical(vertical);		
		target.setHorizontal(tempHorizontal);
		target.setVertical(tempVertical);
		
		return true;
	}
}
