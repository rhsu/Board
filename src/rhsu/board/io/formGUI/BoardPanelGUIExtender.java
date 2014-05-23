package rhsu.board.io.formGUI;

import java.awt.event.ActionEvent;
import rhsu.board.io.BoardWriter;
import rhsu.board.basic.implementations.StringBoard;
import rhsu.terminalPanelGUI.UniversalPanelLauncher;

/**
 *
 * An extender of Board Panel GUI to declare properties and methods.
 * This is just in case BoardPanelGUI gets messed up
 */
public class BoardPanelGUIExtender extends BoardPanelGUI
{
	protected StringBoard board;
	
	public BoardPanelGUIExtender(StringBoard board)
	{
		super();
		
		this.board = board;
		
		jTextField1.setText(this.board.getValueAt(0, 0).toString());
		jTextField2.setText(this.board.getValueAt(0, 1).toString());
		jTextField3.setText(this.board.getValueAt(0, 2).toString());
		jTextField4.setText(this.board.getValueAt(1, 0).toString());
		jTextField5.setText(this.board.getValueAt(1, 1).toString());
		jTextField6.setText(this.board.getValueAt(1, 2).toString());
		jTextField7.setText(this.board.getValueAt(2, 0).toString());
		jTextField8.setText(this.board.getValueAt(2, 1).toString());
		jTextField9.setText(this.board.getValueAt(2, 2).toString());
		
		/*for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				
			}	
		}*/
	}
	
	@Override
	protected void jButtonSaveActionPerformed(ActionEvent evt)
	{
		this.board.setValueAt(0, 0, jTextField1.getText());
		this.board.setValueAt(0, 1, jTextField2.getText());
		this.board.setValueAt(0, 2, jTextField3.getText());
		
		this.board.setValueAt(1, 0, jTextField4.getText());
		this.board.setValueAt(1, 1, jTextField5.getText());
		this.board.setValueAt(1, 2, jTextField6.getText());
		
		this.board.setValueAt(2, 0, jTextField7.getText());
		this.board.setValueAt(2, 1, jTextField8.getText());
		this.board.setValueAt(2, 2, jTextField9.getText());
		
		BoardWriter.write("test.txt", board, '\0');
	}
	
	public static void main(String[] args)
	{	
		StringBoard test = new StringBoard("test.txt");
		UniversalPanelLauncher.Launch(new BoardPanelGUIExtender(test));
	}
}
