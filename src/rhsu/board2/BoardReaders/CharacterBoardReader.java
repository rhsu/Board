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
				String stringValue = this.getBoardInitializer()
					.getValueAt(rowNumber, columnNumber);
				
				row[rowNumber] = new BoardPieceImpl(rowNumber, 
					columnNumber, 
					this.convertFromString(stringValue));
			}
			columnNumber++;
		}
		
		return boardArray;
	}
	
	protected Character convertFromString(String string)
	{
		return string.charAt(0);
	}
}
