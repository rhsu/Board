package rhsu.board2.testBoardModule;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.Board2;
import rhsu.board2.boardModules.BoardModule;
import rhsu.board2.implementations.factories.BoardFactoryClient;
import rhsu.board2.unitTestUtilities.UnitTestStubFactory;

public class BoardModuleTest 
{	
	BoardModule<String> testModule;
	Board2<String> testBoard;
	
	@Before
	public void setup()
	{
		testModule = new UnitTestStubFactory().getBoardModuleStub();
		testBoard = new BoardFactoryClient()
			.GetStringBoardFactory()
			.createBoard(2, 2);
	}
	
	@Test
	public void testAddModule_NullModule_ReturnsFalse()
	{
		boolean result = testBoard.addModule("Null Module", null);
		assertFalse(result);
	}
	
	@Test
	public void testAddModule_Sucessful_ReturnsTrue()
	{
		boolean result = testBoard.addModule("Success", testModule);
		assertTrue(result);
	}
	
	@Test
	public void testAddModule_DuplicateKeyModule_ReturnsFalse()
	{
		testBoard.addModule("One", testModule);
		boolean result = testBoard.addModule("One", testModule);
		assertFalse(result);
	}
	
	@Test
	public void testAddModule_AddedModule_ContainsCorrectParent()
	{
		testBoard.addModule("Module", testModule);
		assertEquals(testBoard, testModule.getParent());
	}
	
	@Test
	public void testRemoveModule_NotThere_ReturnsFalse()
	{
		boolean result = testBoard.removeModule("No");
		assertFalse(result);
	}
	
	@Test
	public void testRemoveModule_RemovedModule_ContainsNoParent()
	{
		testBoard.addModule("Module", testModule);
		testBoard.removeModule("Module");
		
		assertNull(testModule.getParent());
	}
	
	@Test
	public void testGetModule_Sucessful_ReturnsTrue()
	{
		testBoard.addModule("Module", testModule);
		BoardModule<String> result = testBoard.getModule("Module");
		
		assertEquals(testModule, result);
	}
	
	@Test
	public void testGetModule_Fail_ReturnsFalse()
	{
		BoardModule<String> result = testBoard.getModule("Nothing");
		
		assertNull(result);
	}
}
