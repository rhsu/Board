/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rhsu.board.test;

/**
 *
 * @author rhsu
 */
public class MockFactory 
{
	public static Object mock(Mockable mockable)
	{
		return mockable.getMockObject();
	}
}
