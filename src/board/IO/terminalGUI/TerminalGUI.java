package board.IO.terminalGUI;

import com.TerminalPanelGUI.TerminalFrame;
import com.TerminalPanelGUI.TerminalPanel;

public class TerminalGUI extends TerminalPanel
{
	public TerminalGUI()
	{
		super();
	}
	
	@Override
	public String processInput(String text)
	{
		System.out.println("here");
		
		int number;
		boolean hasError;
			
		try
		{
			number = Integer.parseInt(text);
				
			if(number <= 0)
			{
				textArea.append("Dimension cannot be negative of 0");
				//System.out.println("Dimension cannot be negative or 0.");
				hasError = true;
			}
				
			else if(number > 10)
			{
				textArea.append("You have entered a number greater than 10. Are you sure you want to continue");
				//System.out.println("You have entered a number greater than 10. Are you sure you want to continue");
				switch(text)
				{
					case "Yes":
					case "yes":
					case "Y":
					case "y":
						hasError = false;
						break;
					case "No":
					case "no":
					case "N":
					case "n":
						hasError = true;
						//System.out.println("Enter a smaller number.");
						break;
					default:
						hasError = true;
						//System.out.println("Invalid entry. Try again");
						break;
				}
			}
			else
			{
				hasError = false;
			}
		}
		catch(NumberFormatException e)
		{
			textArea.append("Invalid entry. Try again");
			//System.out.println("Invalid entry. Try again");
			hasError = true;
		}
		
		return text;
	}
	
	public static void main(String[] args)
	{
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
            public void run() 
			{
				TerminalFrame terminalFrame = new TerminalFrame(new TerminalGUI());
            }
        });
	}
}
