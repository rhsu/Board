/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rhsu.board.arithmetic;

/**
 *
 * @author rhsu
 */
public interface Matrix<T> 
{
	public Matrix Add(Matrix m);
	public Matrix Subtract(Matrix m);
	public Matrix Multiply(Matrix m);
	public Matrix Inverse();
	public T Determinant();
}
