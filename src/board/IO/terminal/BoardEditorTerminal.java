package board.IO.terminal;

import com.terminalPanelGUI.AbstractTerminal;
import com.terminalPanelGUI.UniversalPanelLauncher;

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
				hasError = false;
				textArea.append("You chose file");
				state = -1;
			}
			else if(text.equalsIgnoreCase("input"))
			{
				hasError = false;
				textArea.append("You chose input");
				state = -2;
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

	}
	
	private void readInputState()
	{
		boolean hasError;
		textArea.append("Enter the number of rows. \n");
		String text = textField.getText();
		do
		{
			try
			{
				Integer.parseInt(text);
				hasError = false;
			}
			catch(NumberFormatException e)
			{
				textArea.append("Invalid input. Try again. \n");
				hasError = true;
			}
		}while(!hasError);
	}
	
	public static void main(String[] args)
	{
		UniversalPanelLauncher.Launch(new BoardEditorTerminal());
	}
}
