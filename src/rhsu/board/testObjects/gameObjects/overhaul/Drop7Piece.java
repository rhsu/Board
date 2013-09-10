package rhsu.board.testObjects.gameObjects.overhaul;

import rhsu.board.utilities.UtilityFunctions;

/**
 *
 * @author rhsu
 */
public enum Drop7Piece 
{
	EMPTY(0, 0),
	MYSTERY1(1, -1),
	MYSTERY2(2, -2),
	SET(3, UtilityFunctions.getRandomNumber());
	
	private int pieceValue;
	private int typeValue;
	private boolean remove;
	
	public int getPieceValue()
	{
		return pieceValue;
	}
	
	public int getTypeValue()
	{
		return typeValue;
	}
	
	public boolean checkRemove()
	{
		return remove;
	}
	
	public void setRemove()
	{
		this.remove = true;
	}
	
	private Drop7Piece(int typeValue, int pieceValue)
	{
		this.typeValue = typeValue;
		this.pieceValue = pieceValue;
		this.remove = false;
	}
}
