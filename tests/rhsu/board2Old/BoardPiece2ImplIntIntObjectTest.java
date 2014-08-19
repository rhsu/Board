package rhsu.board2Old;

import org.junit.*;
import rhsu.board2Old.BoardPiece2Test;
import rhsu.board2Old.factory.BoardPieceFactory;

public class BoardPiece2ImplIntIntObjectTest extends BoardPiece2Test
{
	@Before
	@Override
	public void setupBoardPiece()
	{
		int horizontalIndex = 20;
		int verticalIndex = 30;
		Object value = "DEFAUL_VALUE";
		
		factory = new BoardPieceFactory(horizontalIndex, verticalIndex, value);
		boardPiece = factory.createBoardPieceImpl();
	}
}
