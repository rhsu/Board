package rhsu.board.mobility;

import rhsu.board.BoardPiece;

public interface MobilityPiece<T> extends BoardPiece<T>
{	
	public MobilityStatus getStatus();
	public void setStatus(MobilityStatus status);
}
