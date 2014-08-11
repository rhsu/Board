package rhsu.board2.implementations.factories;

import java.math.BigDecimal;
import rhsu.board2.boardReaders.AbstractBoardIO;
import rhsu.board2.boardReaders.BigDecimalBoardIO;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;
import rhsu.board2.randomGenerators.BigDecimalRandomGenerator;

public class CompositeBoardClients
{
	public static CompositeBoardFactory<BigDecimal> GetBigDecimalBoardClient(BigDecimal defaultValue)
	{
		AbstractRandomGenerator<BigDecimal> randomGenerator = new BigDecimalRandomGenerator();
		AbstractBoardIO<BigDecimal> boardIO = new BigDecimalBoardIO();
		
	}
	
	/*public static CompositeBoardFactory<BigDecimal> GetDecimalBoardClient()
	{
		
	}*/
}
