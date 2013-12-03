/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rhsu.board.test;

import rhsu.board.BoardPiece;

/**
 *
 * @author rhsu
 */
public class MockFactory 
{
	public static BoardPiece<Integer> mockBoardPiece()
	{
		return new BoardPiece<>(-1, -1, 5);
	}
}
