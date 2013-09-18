package rhsu.board.gameObjects;

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
	
	public void setPieceValue(int value)
	{
		this.pieceValue = value;
	}
	
	public int getTypeValue()
	{
		return typeValue;
	}
	
	public void setTypeValue(int value)
	{
		this.typeValue = value;
	}
	
	public boolean checkRemove()
	{
		return remove;
	}
	
	public void setRemove()
	{
		this.remove = true;
	}
	
	public void setEmpty()
	{
		this.typeValue = 0;
		this.pieceValue = 0;
		this.remove = false;
	}
	
	private Drop7Piece(int typeValue, int pieceValue)
	{
		this.typeValue = typeValue;
		this.pieceValue = pieceValue;
		this.remove = false;
	}
}
