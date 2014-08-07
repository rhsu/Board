package rhsu.board2.implementations;

import java.math.BigDecimal;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.Matrix2;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;
import rhsu.board2.randomGenerators.BigDecimalRandomGenerator;

public class BigDecimalBoard2Composite
{
	private class BigDecimalMatrix implements Matrix2
	{
		@Override
		public CompositeBoard add(CompositeBoard matrix)
		{
			throw new UnsupportedOperationException("Not supported yet.");
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
			throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
