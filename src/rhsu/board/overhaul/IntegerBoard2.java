package rhsu.board.overhaul;

/**
 *
 * @author rhsu
 */
public class IntegerBoard2 extends AbstractBoard2<Integer>
{
	@SuppressWarnings({"unchecked"})
	public IntegerBoard2(int h, int v)
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
		IntegerBoard2 test = new IntegerBoard2(5,5);
		
		int a = test.pieceAt2(0, 0).getType();
		int b = test.getTypeAt(0, 0);
	}
}
