package rhsu.board.implementations.math;

import rhsu.board.AbstractBoard;
import java.math.BigInteger;
import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.arithmetic.MatrixPiece;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.implementations.StringBoard;

/**
 *A big integer implementation
 */
public class BigIntegerBoard extends AbstractBoard<BigInteger> implements Matrix<BigInteger>
{
	/**
	 * Constructor to create a BigIntegerBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	@SuppressWarnings({"unchecked"})
	public BigIntegerBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, BigInteger.ZERO);
			}
		}
	}
	
	/**
	 * Constructor to create a BigIntegerBoard based off of a file 
	 * @param filename the name of the file to create a BigIntegerBoard from
	 */
	@SuppressWarnings({"unchecked"})
	public BigIntegerBoard(String filename)
	{
		super(filename);
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					board[i][j] = new BoardPiece(i, j, 
							new BigInteger(baseBoard.getValueAt(i, j)));
				}
				catch(Exception exception)
				{
					ExceptionHandler.Handle(exception);
				}
			}
		}
	}

	@Override
	public Matrix Add(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Subtract(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Multiply(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Inverse() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BigInteger Determinant() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public Matrix Multiply(MatrixPiece piece) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void convertFromStringBoard(StringBoard baseBoard) 
	{
		/*Board<BigIntegerPiece> result = new BigIntegerBoard(baseBoard.getHorizontal_size(), baseBoard.getVertical_size());
		
		try
		{
			for(int h = 0; h < baseBoard.getHorizontal_size(); h++)
			{
				for(int v = 0; v < baseBoard.getVertical_size(); v++)
				{
					//int i = Integer.parseInt(baseBoard.pieceAt(h,v).getType());
					result.pieceAt(h, v).setType(
							new BigInteger(baseBoard.pieceAt(h,v).getType()));
				}
			}
			//return result;
		}
		catch(NumberFormatException e)
		{
			//return null;
		}*/
	}
}
