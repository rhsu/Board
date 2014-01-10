package rhsu.board.mobility.implementation;

import rhsu.board.RandomGenerator;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board.mobility.MobilityPiece;
import rhsu.board.mobility.MobilityStatus;

public class BasicMobilityPiece<T> extends BasicBoardPiece<T>
	implements MobilityPiece<T>
{
	MobilityStatus mobilityStatus;
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
	public BasicMobilityPiece(int horizontal, int vertical, T value)
	{
		super(horizontal, vertical, value);
		this.mobilityStatus = MobilityStatus.Free;
	}
	
	public BasicMobilityPiece(int horizontal, int vertical, RandomGenerator<T> randomGenerator)
	{
		super(horizontal, vertical, randomGenerator);
		this.mobilityStatus = MobilityStatus.Free;
	}
	
	public BasicMobilityPiece(int horizontal, int vertical, T value, MobilityStatus status)
	{
		this(horizontal, vertical, value);
		this.mobilityStatus = status;
	}
	
	//</editor-fold>
	
	@Override
	public MobilityStatus getStatus()
	{
		return this.mobilityStatus;
	}
	
	@Override
	public void copy(MobilityPiece<T> other)
	{		
		this.vertical = other.getVertical();
		this.horizontal = other.getHorizontal();
		this.value = other.getValue();
		this.mobilityStatus = other.getStatus();
	}
}
