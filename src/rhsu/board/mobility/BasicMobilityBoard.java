package rhsu.board.mobility;

import rhsu.board.AbstractBoard;
import rhsu.board.RandomGenerator;

/**
 *
 * @author rhsu
 */
public class BasicMobilityBoard<T> extends AbstractBoard<T> 
	implements MobilityBoard<T>
{
	@SuppressWarnings({"unchecked"})
	public BasicMobilityBoard(int horizontal, int vertical, T defaultValue)
	{
		this.horizontal_size = horizontal;
		this.vertical_size = vertical;
		this.size = horizontal * vertical;
		this.board = new BasicMobilityPiece[horizontal][vertical];
	}
	
	@Override
	public RandomGenerator<T> randomGenerator() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
