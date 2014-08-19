package rhsu.board2Old.random;

import junit.framework.Assert;
import org.junit.*;
import rhsu.board2Old.Board2Test;

@Ignore
public class RandomBoardTest extends Board2Test
{	
	@Test
	public void testRandomGenerator()
	{
		RandomBoard randomBoard = (RandomBoard) board;
		Assert.assertNotNull(randomBoard.randomGenerator().getRandom());
	}
}