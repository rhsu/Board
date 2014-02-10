package rhsu.board.mobility.implementation;

import java.io.BufferedReader;
import rhsu.board.RandomGenerator;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.mobility.MobilityBoard;
import rhsu.board.mobility.MobilityPiece;

/**
 *
 * @author rhsu
 */
public class BasicIntegerMobilityBoard extends IntegerBoard 
	implements MobilityBoard<Integer>
{
	public BasicIntegerMobilityBoard(BufferedReader reader)
	{
		super(reader);
	}

	@Override
	public RandomGenerator<Integer> randomGenerator() 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public boolean move(MobilityPiece<Integer> piece, int horizontal, int vertical) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean move(MobilityPiece<Integer> piece, int horizontal, int vertical, MobilityBoard<Integer> otherBoard) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
