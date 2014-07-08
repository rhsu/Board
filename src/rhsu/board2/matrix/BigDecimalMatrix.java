package rhsu.board2.matrix;

import java.math.BigDecimal;
import rhsu.board.basic.AbstractBasicMatrix;
import rhsu.board.basic.implementations.arithmetic.BigDecimalBoard;
import rhsu.board.utilities.UtilityFunctions;

/**
 *A big decimal implementation
 */
public class BigDecimalMatrix implements Matrix2<BigDecimal>
{	
	@Override
	public Matrix2<BigDecimal> add(Matrix2<BigDecimal> matrix)
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.ADD, matrix);
				
		int h = matrix.getHorizontal_size();
		int v = matrix.getVertical_size();
		BigDecimalBoard result =  new BigDecimalBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigDecimal a = this.getValueAt(i, j);
				BigDecimal b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a.add(b));
			}
		}
		
		return result;
	}

	@Override
	public Matrix2<BigDecimal> subtract(Matrix2<BigDecimal> matrix)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix2<BigDecimal> multiply(Matrix2<BigDecimal> matrix)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public BigDecimalMatrix multiply(BigDecimal scalar) 
	{
		BigDecimalMatrix result = new BigDecimalMatrix(this.horizontal_size,
				this.vertical_size);
		
		for(int h = 0; h < this.horizontal_size; h++)
		{
			for(int v = 0; v < this.vertical_size; v++)
			{
				BigDecimal m = this.getValueAt(h, v);
				result.setValueAt(h, v, m.multiply(scalar));
			}
		}
		
		return result;
	}
	
	@Override
	public BigDecimalMatrix inverse() 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SQUAREMATRIX);

		BigDecimalMatrix inverseMatrix = this.cofactor().transpose();
		
		return inverseMatrix.multiply(BigDecimal.ONE.divide(this.determinant()));
	}

	@Override
	public BigDecimal determinant() 
	{
		CheckDimensions(AbstractBasicMatrix.OperationType.SQUAREMATRIX);

		if(this.horizontal_size == 1) return this.getValueAt(0, 0);
		
		if(this.horizontal_size == 2)
		{
			BigDecimal a = this.getValueAt(0, 0);
			BigDecimal b = this.getValueAt(1, 1);
			BigDecimal c = this.getValueAt(0, 1);
			BigDecimal d = this.getValueAt(1, 0);
			
			BigDecimal result = a.multiply(b);
			BigDecimal result2 = c.multiply(d);
			
			return result.subtract(result2);
			
			//return (this.getValueAt(0, 0) * this.getValueAt(1, 1)) - ( this.getValueAt(0, 1) * this.getValueAt(1, 0));
		}
		
		BigDecimal sum = BigDecimal.ZERO;
		
		for (int i = 0; i < this.horizontal_size; i++) 
		{
			Integer x = UtilityFunctions.changeSign(i);
			sum = sum.add(new BigDecimal(x.toString()));
			//sum = sum 
			//		+ UtilityFunctions.changeSign(i) 
			//		* this.getValueAt(0, i) 
			//		* createSubMatrix(0, i).determinant();
			
			BigDecimal b1 = this.getValueAt(0, i);			
			BigDecimal b2 = createSubMatrix(0,i).determinant();
			BigDecimal b3 = b1.multiply(b2);
			
			sum = sum.multiply(b3);
		}
		
		return sum;
	}
	
	@Override
	public BigDecimalMatrix transpose()
	{
		int h = this.horizontal_size;
		int v = this.vertical_size;
		BigDecimalMatrix result = new BigDecimalMatrix(v, h);
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				result.setValueAt(j, i, this.getValueAt(i, j));
			}
		}
		return result;
	}

	@Override
	public BigDecimalMatrix createSubMatrix(int excluding_row, int excluding_column) 
	{
		BigDecimalMatrix result = new BigDecimalMatrix(this.horizontal_size-1,
				this.vertical_size-1);
	
		int r = -1;
		
		for(int i = 0; i < this.horizontal_size; i++)
		{
			if(i == excluding_row) 
				continue;
				r++;	
				int c = -1;
			
			for(int j = 0; j < this.vertical_size; j++)
			{
				if(j == excluding_column) continue;
				
				result.setValueAt(r, ++c, this.getValueAt(i,j));
			}
		}
		
		return result;
	}

	@Override
	public BigDecimalMatrix cofactor() 
	{
		BigDecimalMatrix result = new BigDecimalMatrix(this.horizontal_size, 
				this.vertical_size);
		
		for(int i = 0; i < this.horizontal_size; i++)
		{
			for(int j = 0; j < this.vertical_size; j++)
			{
				//result.setValueAt(i, j, 
				//		UtilityFunctions.changeSign(i) 
				//		* UtilityFunctions.changeSign(j)
				//		* createSubMatrix(i, j).determinant());
				
				Integer signI = UtilityFunctions.changeSign(i);
				BigDecimal bSignI = new BigDecimal(signI.toString());
				Integer signJ = UtilityFunctions.changeSign(j);
				BigDecimal bSignJ = new BigDecimal(signJ.toString());
				
				BigDecimal value = bSignI
						.multiply(bSignJ)
						.multiply(createSubMatrix(i, j).determinant());
				
				result.setValueAt(i, j, value);
			}
		}
		
		return result;
	}
}
