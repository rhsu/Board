package rhsu.board.implementations;

import rhsu.board.AbstractBoard;
import rhsu.board.Board;

/**
 *A boolean implementation
 */
public class BooleanBoard extends AbstractBoard<BooleanPiece>
{
	public BooleanBoard(int h, int v)
	{
		super(h, v);
		board = new BooleanPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BooleanPiece(i, j, false);
			}
		}
	}

	@Override
	public Board<BooleanPiece> ConvertFromStringBoard(StringBoard baseBoard) 
	{
		if(baseBoard.getHorizontal_size() != this.getHorizontal_size()
				|| baseBoard.getVertical_size() !=  this.getVertical_size())
		{
			//throw new ArrayOutOfBoundsException("Invalid Dimensions: Cannot Convert");
		}
		
		for(int h = 0; h < baseBoard.getHorizontal_size(); h++)
		{
			for(int v = 0; v < baseBoard.getVertical_size(); v++)
			{
				Boolean b = Boolean.valueOf(baseBoard.getTypeAt(h, v).toString());
				System.out.println(b);
			}
		}
		
		
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
