package rhsu.board.mobility.implementation;

import rhsu.board.AbstractBoard;
import rhsu.board.RandomGenerator;
import rhsu.board.mobility.MobilityBoard;
import rhsu.board.mobility.MobilityPiece;

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
	public boolean move(MobilityPiece piece, int horizontal, int vertical) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean move(MobilityPiece piece, int horizontal, int vertical, MobilityBoard board) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
