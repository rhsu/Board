package rhsu.board2;

import java.io.BufferedReader;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.Board;
import rhsu.board.BoardPiece;
import rhsu.board.Direction;
import rhsu.board.Matrix;
import rhsu.board.io.BoardIO;

/**
 *
 * @author rhsu
 */
public class BoardBuilderTest
{	
	private class MockBoardIO implements BoardIO
	{
		@Override
		public void populateFromFile(String filename)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public void populateFromResource(BufferedReader reader)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public void initializeFromBaseBoard()
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public void export(String filename, char delimiter)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}
		
	}
	
	private class MockMatrix<T> implements Matrix2<T>
	{
		@Override
		public CompositeBoard<T> add(CompositeBoard<T> matrix)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public CompositeBoard<T> subtract(CompositeBoard<T> matrix)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public CompositeBoard<T> multiply(CompositeBoard<T> matrix)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public CompositeBoard<T> multiply(T piece)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public CompositeBoard<T> inverse()
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public T determinant()
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public CompositeBoard<T> transpose()
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public CompositeBoard<T> createSubMatrix(int excluding_row, int excluding_column)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public CompositeBoard<T> cofactor()
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}
		
	}
	
	private class MockMobilityBoard<T> implements MobilityBoard<T>
	{
		@Override
		public boolean move(BoardPiece<T> piece, int horizontal, int vertical)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public boolean move(BoardPiece<T> piece, int horizontal, int vertical, Board<T> otherBoard)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public boolean move(BoardPiece<T> piece, int units, Direction direction)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}

		@Override
		public boolean move(BoardPiece<T> piece, int units, Direction direction, Board<T> otherBoard)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}
	}
	
	private class MockRandomGenerator<T> implements RandomGenerator<T>
	{
		@Override
		public T getRandom()
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}
	}
	
	private class MockBoardInitializable<T> implements BoardInitializable<T>
	{
		@Override
		public BoardPiece2<T>[][] initializeBoard(BoardPiece2<T>[][] boardArray)
		{
			throw new UnsupportedOperationException("Mock Method: Not Implemented");
		}
	}
	
	
}
