package rhsu.board.IO.formGUI;

import rhsu.board.Board;

/**
 *
 * An extender of Board Panel GUI to declare properties and methods.
 * This is just in case BoardPanelGUI gets messed up
 */
public class BoardPanelGUIExtender extends BoardPanelGUI
{
	public BoardPanelGUIExtender(Board b)
	{
		super();
		
		jTextField1.setText(b.getValueAt(0, 0).toString());
		jTextField2.setText(b.getValueAt(0, 1).toString());
		jTextField3.setText(b.getValueAt(0, 2).toString());
		jTextField4.setText(b.getValueAt(1, 0).toString());
		jTextField5.setText(b.getValueAt(1, 1).toString());
		jTextField6.setText(b.getValueAt(1, 2).toString());
		jTextField7.setText(b.getValueAt(2, 0).toString());
		jTextField8.setText(b.getValueAt(2, 1).toString());
		jTextField9.setText(b.getValueAt(2, 2).toString());
		
		/*for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				
			}	
		}*/
	}
}
