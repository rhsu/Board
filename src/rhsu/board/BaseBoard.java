package rhsu.board;

/**
 *
 * @author rhsu
 */
public class BaseBoard<T extends AbstractPiece> extends AbstractBoard<T>
{
	public BaseBoard(int h, int v)
	{
		super(h, v);
	}
}
