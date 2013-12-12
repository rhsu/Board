package rhsu.board.xc;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.BasicBoardPiece;
import rhsu.board.test.MockFactory;

/**
 *
 * @author rhsu
 */
public class LinkedGStructTest 
{
	static LinkedGStruct<Integer> mockLinkedGStruct;
	static BasicBoardPiece<Integer> mockBoardPiece;
	static GSNode<Integer> mockGSNode;
	
	@BeforeClass
	public static void setUpClass()
	{
		mockLinkedGStruct = MockFactory.mockLinkedGStruct();
		mockBoardPiece = MockFactory.mockBoardPiece();
		mockGSNode = MockFactory.mockGSNode();
	}
	
	@Before
	public void setUp()
	{
		mockLinkedGStruct.clean();
	}
	
	@Test
	public void testCount()
	{
		System.out.println("count");
		int count = mockLinkedGStruct.count();
		assertEquals(count, 0);
	}
	
	@Test
	public void testInsertFront1()
	{
		System.out.println("insertFront boardPiece");
		int numItems = 100;
		for(int i = 0; i < numItems; i++)
		{
			mockLinkedGStruct.insertFront(MockFactory.mockBoardPiece());
		}
		
		assertEquals(numItems, mockLinkedGStruct.count());
	}
	
	@Test
	public void testInsertFront2()
	{
		System.out.println("insertFront node");
		int numItems = 100;
		for(int i = 0; i < numItems; i++)
		{
			mockLinkedGStruct.insertFront(MockFactory.mockGSNode());
		}
		
		assertEquals(numItems, mockLinkedGStruct.count());
	}
	
	@Test
	public void testClean()
	{
		System.out.println("clean");
		for(int i = 0; i < 5; i++)
		{
			mockLinkedGStruct.insertFront(mockBoardPiece);
		}
		
		mockLinkedGStruct.clean();
		
		assertEquals(0, mockLinkedGStruct.count());
	}
}
