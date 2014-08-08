package rhsu.board2.BoardReaders;

import rhsu.board2.BoardPiece2;
import rhsu.board2.BoardPieceImpl;

public class CharacterBoardReader extends AbstractBoardIO<Character>
{
	@Override
	public BoardPiece2[][] initializeBoard(BoardPiece2[][] boardArray)
	{
		int columnNumber = 0;

		for (BoardPiece2<Character>[] row : boardArray)
		{
			for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
			{ 
				row[rowNumber] = new BoardPieceImpl(rowNumber, 
					columnNumber, 
					this.getBoardInitializer().getPieceAt(rowNumber, columnNumber));
			}
			columnNumber++;
		}
		
		return boardArray;
	}	
}
