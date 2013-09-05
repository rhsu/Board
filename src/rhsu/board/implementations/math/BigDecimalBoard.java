package rhsu.board.implementations.math;

import rhsu.board.AbstractBoard;
import java.math.BigDecimal;
import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.arithmetic.MatrixPiece;
import rhsu.board.exceptionHandler.ExceptionHandler;

/**
 *A big decimal implementation
 */
public class BigDecimalBoard extends AbstractBoard<BigDecimal> implements Matrix<BigDecimal>
{
	/**
	 * Constructor to create a BigDecimalBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	@SuppressWarnings({"unchecked"})
	public BigDecimalBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, BigDecimal.ZERO);
			}
		}
	}
	
	/**
	 * Constructor to create a BigDecimalBoard based off of a file 
	 * @param filename the name of the file to create a BigDecimalBoard from
	 */
	@SuppressWarnings({"unchecked"})
	public BigDecimalBoard(String filename)
	{
		super(filename);
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					board[i][j] = new BoardPiece(i, j, 
							new BigDecimal(baseBoard.getValueAt(i, j)));
				}
				catch(Exception exception)
				{
					//board[i][j] = new BoardPiece(i, j, 
					//		"ERROR");
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
	public BigDecimal Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Multiply(MatrixPiece piece) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
