package rhsu.board.IO.terminal;

import com.terminalPanelGUI.AbstractTerminal;
import com.terminalPanelGUI.UniversalPanelLauncher;
import rhsu.board.utilities.UtilityFunctions;

/**
 *
 * @author rhsu
 */
public class BoardEditorTerminal extends AbstractTerminal
{
	public BoardEditorTerminal()
	{
		super();
		textArea.append("Read in by file or by input? \n");
	}
	
	@Override
	protected String processInput(String text)
	{
		switch(state)
		{
			case 0:
				initialState();
				break;
			case 1:
				fileProcessingState();
				break;
			case 2:
				readInputState();
				break;
		}
		
		return null;
	}
	
	public void initialState()
	{
		//examine user input
		String text = textField.getText();
		boolean hasError;
		
		do
		{
			if(text.equalsIgnoreCase("file"))
			{
				textArea.append("You chose file");
				state = 1;
				break;
			}
			else if(text.equalsIgnoreCase("input"))
			{

				textArea.append("You chose input");
				textArea.append("Enter the number of rows. \n");
				state = 2;
				break;
			}
			else
			{
				textArea.append("Invalid input. Try again \n");
				textArea.append("Read in by file or by input? \n");
				state = 0;
				hasError = true;
			}	
		}while(!hasError);

	}
	
	private void fileProcessingState() 
	{
		textArea.append("You are in the file processing state. Not yet implemented \n");
	}
	
	private void readInputState()
	{
		boolean hasError = false;

		String text = textField.getText();
		
		do
		{
			if(UtilityFunctions.isInteger(text))
			{	
				hasError = (Integer.parseInt(text) <= 0);
			}
			else
			{
				hasError = true;
				System.out.println("In here?");
			}
			
			if(hasError)
			{
				textArea.append("Invalid input. Try again. \n");
			}
			else
			{
				textArea.append("Done!");
			}
			
		}while(hasError);
	}
	
	public static void main(String[] args)
	{
		UniversalPanelLauncher.Launch(new BoardEditorTerminal());
	}
}
