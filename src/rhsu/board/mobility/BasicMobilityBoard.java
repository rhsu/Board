package rhsu.board.mobility;

import rhsu.board.AbstractBoard;
import rhsu.board.RandomGenerator;

/**
 *
 * @author rhsu
 */
public class BasicMobilityBoard<T> extends AbstractBoard<T>
{
	public BasicMobilityBoard(int horizontal, int vertical, T defaultValue)
	{
		
	}
	
	@Override
	public RandomGenerator<T> randomGenerator() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
