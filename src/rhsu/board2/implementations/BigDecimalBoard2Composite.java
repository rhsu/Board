package rhsu.board2.implementations;

import java.math.BigDecimal;
import rhsu.board.basic.AbstractBasicMatrix;
import rhsu.board2.AbstractMatrix2;
import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.CompositeBoardImpl;
import rhsu.board2.Matrix2;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;
import rhsu.board2.randomGenerators.BigDecimalRandomGenerator;

public class BigDecimalBoard2Composite
{
	private class BigDecimalMatrix extends AbstractMatrix2
	{
		public BigDecimalMatrix(CompositeBoard parent)
		{
			super(parent);
		}
		
		@Override
		public CompositeBoard add(CompositeBoard matrix)
		{
			super.CheckDimensions(AbstractBasicMatrix.OperationType.ADD, matrix);
			
			CompositeBoard<BigDecimal> result = BigDecimalBoard2Composite.createBigDecimalBoard(
				this.horizontalSize, this.verticalSize);
			
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
	
	static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;

	public static CompositeBoard<BigDecimal> createBigDecimalBoard(int horizontalSize, 
		int verticalSize,
		BigDecimal defaultValue)
	{	
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<BigDecimal> createBigDecimalBoard(int horizontalSize, int verticalSize)
	{		
		return createBigDecimalBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public static CompositeBoard<BigDecimal> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{	
		AbstractRandomGenerator randomGenerator = new BigDecimalRandomGenerator();
		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(randomGenerator)
			.setBoardInitializable(randomGenerator)
			.createBoard();
	}
}
