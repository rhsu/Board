package rhsu.board2.matrices;

import java.math.BigDecimal;
import rhsu.board.basic.AbstractBasicMatrix;
import rhsu.board2.CompositeBoard;
import rhsu.board2.implementations.factories.BoardClients;

public class BigDecimalMatrix extends AbstractMatrix2
{
	public BigDecimalMatrix(CompositeBoard parent)
	{
		super(parent);
	}

	@Override
	public CompositeBoard add(CompositeBoard matrix)
	{
		super.CheckDimensions(AbstractBasicMatrix.OperationType.ADD, matrix);

		CompositeBoard<BigDecimal> result = BoardClients
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
	public CompositeBoard subtract(CompositeBoard matrix)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public CompositeBoard multiply(CompositeBoard matrix)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public CompositeBoard multiply(Object piece)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public CompositeBoard inverse()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Object determinant()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public CompositeBoard transpose()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public CompositeBoard createSubMatrix(int excluding_row, int excluding_column)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public CompositeBoard cofactor()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}