package rhsu.board2;

import java.util.UUID;
import org.junit.*;
import rhsu.board2.mobility.MobilityStatus;
import rhsu.board2.unitTestUtilities.UnitTestLibrary;

public class BoardPiece2Test
{
	protected BoardPiece2<Object> piece;
	protected final int horizontalIndex = 34;
	protected final int verticalIndex = 56;
	protected final Object value = new Object();
	
	@Before
	public void setup()
	{
		piece = new BoardPieceImpl(34, 56, value);
	}
	
	@Test
	public void testAccessor_Value()
	{
		Object differentValue = new Object();
		piece.setValue(differentValue);
		UnitTestLibrary.accessorAssertion(piece.getValue(), differentValue);
	}
	
	@Test
	public void testAccessor_horizontalIndex()
	{
		UnitTestLibrary.accessorAssertion(piece.getHorizontalIndex(), horizontalIndex);
	}
	
	@Test
	public void testAccessor_verticalIndex()
	{
		UnitTestLibrary.accessorAssertion((piece.getVerticalIndex()), verticalIndex);
	}
	
	@Test
	public void testAccessor_mobilityStatus()
	{
		MobilityStatus status = MobilityStatus.Free;
		piece.setMobilityStatus(status);
		UnitTestLibrary.accessorAssertion(piece.getMobilityStatus(), status);
	}
	
	@Test
	public void testAccessor_uuid()
	{
		UUID identifier = UUID.randomUUID();
		piece.setUUID(identifier);
		UnitTestLibrary.accessorAssertion(piece.getUUID(), identifier);
	}
}
