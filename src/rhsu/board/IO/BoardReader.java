package rhsu.board.IO;

import rhsu.board.AbstractPiece;

/**
 *
 * @author rhsu
 */
public interface BoardReader<T extends AbstractPiece>
{	
	public void mainPrompt();
	public void readInByInput();
	public void readInByFile();
	public void displayHelp();
}
