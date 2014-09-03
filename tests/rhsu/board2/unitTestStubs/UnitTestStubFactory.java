package rhsu.board2.unitTestStubs;

import java.io.BufferedReader;
import rhsu.board2.CompositeBoard;
import rhsu.board2.boardIO.Board2IO;
import rhsu.board2.matrices.Matrix2;

public class UnitTestStubFactory<T>
{
	private Board2IO<T> boardIO = null;
	private Matrix2<T> matrix = null;
	
	public Board2IO<T> GetBoard2IOStub()
	{
		if(boardIO == null)
		{
			boardIO = new Board2IO<T>() 
			{
				@Override
				public CompositeBoard<String> getBoardInitializer()
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public void populateFromFile(String filename, String delimiter)
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public void populateFromResource(BufferedReader reader, String delimiter)
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public void export(String filename, char delimiter)
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}
			};
		}
		return boardIO;
	}
	
	public Matrix2<T> GetMatrix2Stub()
	{
		if(matrix == null)
		{
			matrix = new Matrix2<T>()
			{
				@Override
				public CompositeBoard<T> add(CompositeBoard<T> matrix)
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public CompositeBoard<T> subtract(CompositeBoard<T> matrix)
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public CompositeBoard<T> multiply(CompositeBoard<T> matrix)
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public CompositeBoard<T> multiply(T piece)
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public CompositeBoard<T> inverse()
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public T determinant()
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public CompositeBoard<T> transpose()
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public CompositeBoard<T> createSubMatrix(int excluding_row, int excluding_column)
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}

				@Override
				public CompositeBoard<T> cofactor()
				{
					throw new UnsupportedOperationException("Not supported yet.");
				}
			};
		}
		return matrix;
	}
}
