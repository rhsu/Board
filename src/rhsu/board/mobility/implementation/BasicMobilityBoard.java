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
		throw new UnsupportedOperationException("Not Supported Yet");
	}

	@Override
	public boolean move(MobilityPiece<T> piece, int horizontal, int vertical, MobilityBoard board) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
