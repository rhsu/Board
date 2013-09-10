package rhsu.board.testObjects.gameObjects.overhaul;

import rhsu.board.AbstractBoard;

/**
 *
 * @author rhsu
 */
public class Drop7Board extends AbstractBoard<Drop7Piece>
{
	public Drop7Board(int h, int v)
	{
		this(h, v, Drop7Piece.EMPTY);
	}
	
	public Drop7Board(int h, int v, Drop7Piece defaultValue)
	{
		super(h, v, defaultValue);
	}
}
