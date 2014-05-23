package rhsu.board2.factory;

import rhsu.board2.basic.BoardPieceImpl;

public class BoardPieceFactory
{
	private final int horizontalIndex;
	private final int verticalIndex;
	private final Object boardPieceValue;
	
	public int getHorizontalIndex() { return this.horizontalIndex; }
	public int getVerticalIndex() { return this.verticalIndex; }
	public Object getBoardPieceValue() { return this.boardPieceValue; }
	
	public BoardPieceFactory(int horizontalIndex, int verticalIndex, Object boardPieceValue)
	{
		this.horizontalIndex = horizontalIndex;
		this.verticalIndex = verticalIndex;
		this.boardPieceValue = boardPieceValue; 
	}
	
	public BoardPieceImpl createBoardPieceImpl()
	{
		return new BoardPieceImpl<>(horizontalIndex, verticalIndex, boardPieceValue);
	}
}
