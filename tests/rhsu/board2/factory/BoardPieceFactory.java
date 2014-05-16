package rhsu.board2.factory;

import rhsu.board2.basic.BoardPiece2Impl;

public class BoardPieceFactory
{
	private final int horizontalIndex;
	private final int verticalIndex;
	private final Object boardPieceValue;
	
	public BoardPieceFactory(int horizontalIndex, int verticalIndex, Object boardPieceValue)
	{
		this.horizontalIndex = horizontalIndex;
		this.verticalIndex = verticalIndex;
		this.boardPieceValue = boardPieceValue; 
	}
	
	public BoardPiece2Impl createBoardPieceImpl()
	{
		return new BoardPiece2Impl<>(horizontalIndex, verticalIndex, boardPieceValue);
	}
}
