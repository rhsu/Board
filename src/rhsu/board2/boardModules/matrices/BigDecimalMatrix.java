package rhsu.board2.boardModules.matrices;

import java.math.BigDecimal;
import rhsu.board.basic.AbstractBasicMatrix;
import rhsu.board2.Board2;
import rhsu.board2.implementations.factories.BoardFactoryClient;

public class BigDecimalMatrix extends AbstractMatrix2
{
	public BigDecimalMatrix(Board2 parent)
	{
		super(parent);
	}

	@Override
	public Board2 add(Board2 matrix)
	{
		super.CheckDimensions(AbstractBasicMatrix.OperationType.ADD, matrix);

		Board2<BigDecimal> result = new BoardFactoryClient()
			.GetBigDecimalBoardFactory()
			.createBoard(this.horizontalSize, this.verticalSize);
		
		for(int i = 0; i < horizontalSize; i++)
		{
			for(int j = 0; j < verticalSize; j++)
			{
				BigDecimal a = (BigDecimal) parent.getValueAt(i, j);
				BigDecimal b = (BigDecimal) matrix.getValueAt(i, j);		
				result.setValueAt(i, j, a.add(b));
			}
		}

		return result;
	}

	@Override
	public Board2 subtract(Board2 matrix)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Board2 multiply(Board2 matrix)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Board2 multiply(Object piece)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Board2 inverse()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Object determinant()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Board2 transpose()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Board2 createSubMatrix(int excluding_row, int excluding_column)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Board2 cofactor()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}