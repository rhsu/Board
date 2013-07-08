package rhsu.board;

/**
 *
 * @author rhsu
 */
public class BaseBoard<T extends AbstractPiece> extends AbstractBoard<T>
{
		public BaseBoard(int i, int j)
		{
			super(i,j);
		}
}
