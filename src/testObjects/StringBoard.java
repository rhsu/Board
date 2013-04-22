package testObjects;

import board.AbstractBoard;

public class StringBoard extends AbstractBoard<StringPiece>
{
	public StringBoard()
	{
		board = new StringPiece[7][7];
		for(int i = 0; i < 7; i++)
		{
			for(int j = 0; j < 7; j++)
			{
				board[i][j] = new StringPiece(i, j, "");
			}
		}
	}
}
