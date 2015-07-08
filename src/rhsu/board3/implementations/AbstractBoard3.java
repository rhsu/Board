package rhsu.board3.implementations;

import rhsu.board.Direction;
import rhsu.board3.Board3;

class AbstractBoard3<T> implements Board3<T>
{
	protected int horizontalSize;
	protected int verticalSize;
	
	@Override
	public int getHorizontalSize() { return this.horizontalSize; }

	@Override
	public int getVerticalSize() { return this.verticalSize; }

	@Override
	public int getSize() { return this.horizontalSize * this.verticalSize; }

	@Override
	public T getValueAt(int horizontal, int vertical) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public T getValueAt(int horizontal, int vertical, Direction direction, int units) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setValueAt(int horizontal, int vertical, T value) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	AbstractBoard3()
	{
		
	}
}
