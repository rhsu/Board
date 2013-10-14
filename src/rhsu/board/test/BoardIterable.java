/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rhsu.board.test;

import java.util.Iterator;
import rhsu.board.BoardPiece;

/**
 *
 * @author rhsu
 */
public interface BoardIterable<T>
{
	Iterator<BoardPiece<T>> iterator();
}
