package rhsu.board2.randomGenerators;

import static org.junit.Assert.*;
import org.junit.*;

public class AbstractRandomGeneratorTest 
{
	private final AbstractRandomGeneratorFactory factory;
	
	public AbstractRandomGeneratorTest()
	{
		factory = new AbstractRandomGeneratorFactory();
	}
	
	@Test
	public void getBigDecimalRandomGeneratorTest()
	{
		assertNotNull(factory.getBigDecimalRandomGenerator().getRandom());
	}
	
	@Test
	public void getBigIntegerRandomGeneratorTest()
	{
		assertNotNull(factory.getBigIntegerRandomGenerator().getRandom());
	}
	
	@Test
	public void getBooleanRandomGeneratorTest()
	{
		assertNotNull(factory.getBooleanRandomGenerator().getRandom());
	}
	
	@Test
	public void getCharacterRandomGeneratorTest()
	{
		assertNotNull(factory.getCharacterRandomGenerator().getRandom());
	}
	
	@Test
	public void getDoubleRandomGeneratorTest()
	{
		assertNotNull(factory.getDoubleRandomGenerator().getRandom());
	}
	
	@Test
	public void getIntegerRandomGeneratorTest()
	{
		assertNotNull(factory.getIntegerRandomGenerator().getRandom());
	}
	
	@Test
	public void getStringRandomGeneratorTest()
	{
		assertNotNull(factory.getStringRandomGenerator().getRandom());
	}
}
