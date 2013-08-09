package rhsu.board.arithmetic;

import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board.AbstractBoard;
import rhsu.board.implementations.math.IntegerBoard;

/**
 *
 * @author rhsu
 */
public abstract class AbstractMatrix<T> extends AbstractBoard<T> implements Matrix<T>
{
	public AbstractMatrix(int h, int v)
	{
		super(h, v);
	}
	
	public AbstractMatrix(String filename)
	{
		super(filename);
	}
}
