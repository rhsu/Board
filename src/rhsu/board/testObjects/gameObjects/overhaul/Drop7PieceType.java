package rhsu.board.testObjects.gameObjects.overhaul;

/**
 *
 * @author rhsu
 */
public enum Drop7PieceType 
{
	/**
	 *Denotes a piece that is empty. The default status
	 */
	EMPTY(0),
	/**
	 *Denotes a piece that is in the first mystery stage.
	 *A piece in this stage transitions into mystery2
	 */
	MYSTERY1(1),
	/**
	 *The final stage of mystery. 
	 * A piece in this stage transitions into set.
	 */
	MYSTERY2(2),
	/**
	 *Denotes that a piece is in its set stage.
	 */
	SET(3);
	
	private int value;
	
	public int getValue()
	{
		return value;
	}
	
	private Drop7PieceType(int v)
	{
		this.value = v;
	}
}
