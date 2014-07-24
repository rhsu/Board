package rhsu.board2.randomGenerators;

import java.math.BigDecimal;
import java.util.Random;
import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardPiece2;
import rhsu.board2.BoardPieceImpl;
import rhsu.board2.RandomGenerator;

public class BigDecimalRandomGenerator implements RandomGenerator<BigDecimal>,
	BoardInitializable<Boolean>
{
	@Override
	public BigDecimal getRandom()
	{
		return new BigDecimal(new Random().nextDouble());
	}

	@Override
	public BoardPiece2<Boolean>[][] initializeBoard(BoardPiece2<Boolean>[][] boardArray)
	{
		int columnNumber = 0;

		for (BoardPiece2<Boolean>[] row : boardArray)
		{
			for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
			{ 
				row[rowNumber] = new BoardPieceImpl(rowNumber, 
					columnNumber, 
					this.getRandom());
			}
			columnNumber++;
		}
		
		return boardArray;
	}
}