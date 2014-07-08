package rhsu.compositeBoard.implementations;

import java.math.BigInteger;
import rhsu.board.io.BoardIO;
import rhsu.board2.Board2;
import rhsu.board2.BoardImpl;
import rhsu.board2.matrix.Matrix2;
import rhsu.board2.random.RandomBoard;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.CompositeBoardImpl;
import rhsu.compositeBoard.MobilityBoard;

public class BigIntegerBoard2Composite extends CompositeBoardImpl
{
	static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;

	public BigIntegerBoard2Composite(Board2<BigInteger> boardCore, 
		BoardIO boardIO, 
		Matrix2<BigInteger> matrix, 
		MobilityBoard<BigInteger> mobilityBoard, 
		RandomBoard<BigInteger> randomBoard)
	{
		super(boardCore, boardIO, matrix, mobilityBoard, randomBoard);
	}
	
	public static CompositeBoard<BigInteger> createBigIntegerBoard(int horizontalSize, 
		int verticalSize,
		BigInteger defaultValue)
	{
		return new BoardBuilder()
			.setBoardCore(new BoardImpl<BigInteger>(horizontalSize, verticalSize, defaultValue) )
			.createBoard();
	}
	
	public static CompositeBoard<BigInteger> createBigIntegerBoard(int horizontalSize, int verticalSize)
	{		
		return createBigIntegerBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
