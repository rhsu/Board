package rhsu.board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import rhsu.board.AbstractPiece;
import rhsu.board.implementations.math.IntBoard;
import rhsu.board.utilities.UtilityFunctions;

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
