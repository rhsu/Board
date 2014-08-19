/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rhsu.board2;

/**
 *
 * @author robert
 */
public class Board2ImplementationsTest
{
	public enum Types
	{
		BIGDECIMAL,
		DECIMAL,
		CHARACTER,
		DOUBLE,
		INTEGER,
		STRING
	}
	
	public static void main(String[] args)
	{
		for (Types type : Types.values())
		{
			System.out.println(type);
		}
	}
}
