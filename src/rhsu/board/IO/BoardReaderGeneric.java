package rhsu.board.IO;

import rhsu.board.AbstractBoard;
import rhsu.board.AbstractPiece;
import rhsu.board.sampleImplementatoins.StringBoard;

/**
 *
 * @author rhsu
 */
public class BoardReaderGeneric<T extends AbstractPiece>
{
	private AbstractBoard<T> myBoard;
	
	public BoardReaderGeneric()
	{
	
	}
	
	public static void main(String[] args)
	{
		AbstractBoard test = new StringBoard(5,5);
		System.out.println(test);
	}
}
