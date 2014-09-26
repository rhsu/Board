package rhsu.mathFactory;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ArithmeticType
{	
	private int radix; 
	private String value;
	
	public void setRadix(int radix) { this.radix = radix; }
	public int getRaidx() { return this.radix; }
	public void setValue(String value) { this.value = value; }
	public String getValue() { return this.value; }
	
	public ArithmeticType(int radix, String value)
	{
		this.radix = radix;
		this.value = value;
	}
	
	public ArithmeticType()
	{
		this(10, "0");
	}
	
	public BigInteger getBigInteger()
	{		
		return new BigInteger(this.value, this.radix);
	}
	
	public BigDecimal getBigDecimal()
	{
		return new BigDecimal(this.getBigInteger());
	}
	
	public Integer getInteger()
	{
		return Integer.parseInt(this.value, this.radix);
	}
	
	public Double getDouble()
	{
		return this.getInteger().doubleValue();
	}
}