package rhsu.board.implementations.math;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.AbstractMatrix;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.implementations.StringBoard;
import rhsu.board.utilities.UtilityFunctions;

/**
 *A big integer implementation
 */
public class BigIntegerBoard extends AbstractMatrix<BigInteger>
{
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
	
	@SuppressWarnings({"unchecked"})
	public BigIntegerBoard(String filename)
	{
		super(filename);
		
		try
		{
			for(int i = 0; i < horizontal_size; i++)
			{
				for(int j = 0; j < vertical_size; j++)
				{
					board[i][j] = UtilityFunctions.isInteger(baseBoard.getTypeAt(i, j)) ?
							new BoardPiece(i, j, baseBoard.getTypeAt(i, j))
							: new BoardPiece(i, j, "0");
				}
			}
		}
		catch(NumberFormatException e)
		{
			board = null;
		}
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					board[i][j] = new BoardPiece(i, j, 
							new BigInteger(baseBoard.getTypeAt(i, j)));
				}
				catch(NumberFormatException e)
				{
					board[i][j] = new BoardPiece(i, j, 
							"ERROR");
				}
			}
		}
	}

	@Override
	public BigIntegerBoard Add(Matrix<BigInteger> m) 
	{
		CheckAddDimensions(m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigIntegerBoard result =  new BigIntegerBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigInteger a = this.getTypeAt(i, j);
				BigInteger b = m.getTypeAt(i, j);		
				result.setTypeAt(i, j, a.add(b));
			}
		}
		
		return result;
	}

	@Override
	public BigIntegerBoard Subtract(Matrix<BigInteger> m) 
	{
		CheckAddDimensions(m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigIntegerBoard result =  new BigIntegerBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigInteger a = this.getTypeAt(i, j);
				BigInteger b = m.getTypeAt(i, j);		
				result.setTypeAt(i, j, a.subtract(b));
			}
		}
		
		return result;
	}

	@Override
	public BigIntegerBoard Multiply(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BigIntegerBoard Multiply(BigInteger scalar) 
	{
		BigIntegerBoard result = new BigIntegerBoard(this.horizontal_size,
				this.vertical_size);
		
		for(int h = 0; h < this.horizontal_size; h++)
		{
			for(int v = 0; v < this.vertical_size; v++)
			{
						
				BigInteger m = this.getTypeAt(h, v);
				result.setTypeAt(h, v, m.multiply(scalar));
			}
		}
		
		return result;
	}
	
	@Override
	public BigIntegerBoard Inverse() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BigInteger Determinant() {
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
