package rhsu.board.implementations;

import rhsu.board.AbstractBoard;
import rhsu.board.Board;

/**
 *A boolean implementation
 */
public class BooleanBoard extends AbstractBoard<Boolean>
{
	
	@SuppressWarnings({"unchecked"})
	public BooleanBoard(int h, int v)
	{
		super(h, v);
		board = new AbstractPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new AbstractPiece(i, j, false);
			}
		}
	}

	/*public BooleanBoard(StringBoard copy)
	{
		//super(copy);
		//this.convertFromStringBoard(copy);
	}*/
	
	/*
	public BooleanBoard(AbstractBoard<BooleanPiece> other)
	{
		super(other);
		int h = other.getHorizontal_size();
		int v = other.getVertical_size();
		board = new BooleanPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = other.pieceAt(i, j);
			}
		}
	}*/
	
	@Override
	public void convertFromStringBoard(StringBoard baseBoard) 
	{	
		BooleanBoard result = new BooleanBoard(baseBoard.getHorizontal_size(), baseBoard.getVertical_size());
		
		for(int h = 0; h < baseBoard.getHorizontal_size(); h++)
		{
			for(int v = 0; v < baseBoard.getVertical_size(); v++)
			{
				/*Boolean b = (baseBoard.pieceAt(h, v).getType().equals("1")) ? true
						: Boolean.valueOf(baseBoard.pieceAt(h, v).toString());
				result.pieceAt(h, v).setType(b);*/
			}
		}
	}
}
