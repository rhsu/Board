package rhsu.board.overhaul;

/**
 *
 * @author rhsu
 */
public class AbstractBoardImpl extends AbstractBoard2<Integer>
{
	@SuppressWarnings({"unchecked"})
	public AbstractBoardImpl(int h, int v)
	{
		super(h,v);
		
		board = new AbstractPiece2[h][v];
		
		for(int i = 0; i < h; i++)
		{			
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new AbstractPiece2<>(1,1,1);
			}
		}
	}
		
	public static void main(String[] args)
	{
		AbstractBoardImpl test = new AbstractBoardImpl(5,5);
		
		int a = test.pieceAt2(0, 0).getType();
	}
}
