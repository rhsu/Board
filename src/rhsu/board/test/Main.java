package rhsu.board.test;

import java.util.UUID;
import rhsu.board.Board;
import rhsu.board.BoardPiece;
import rhsu.board.Direction;
import rhsu.board.basic.implementations.StringBoard;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.io.formGUI.BoardPanelGUIExtender;
import rhsu.board.resources.ResourceRetriever;
import rhsu.terminalPanelGUI.UniversalPanelLauncher;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
            System.out.println(o);
    }
    
	public static void main(String[] args)
	{
		UUID gina = UUID.randomUUID();
		
		System.out.println(gina);
	} 
}
