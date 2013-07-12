package rhsu.board.implementations;

import java.util.HashSet;
import java.util.Set;
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
		Board<BooleanPiece> result = new BooleanBoard(baseBoard.getHorizontal_size(), baseBoard.getVertical_size());
		
		for(int h = 0; h < baseBoard.getHorizontal_size(); h++)
		{
			for(int v = 0; v < baseBoard.getVertical_size(); v++)
			{
				Boolean b = (baseBoard.getTypeAt(h, v).equals("1")) ? true : Boolean.valueOf(baseBoard.getTypeAt(h, v).toString());
				result.pieceAt(h, v).setType(b);
			}
		}
		
		return result;
	}
}
