package rhsu.board.test;

import rhsu.board.basic.implementations.StringBoard;
import rhsu.board.basic.implementations.CharBoard;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.mobility.implementation.*;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board.utilities.PrintUtilityDebugger;
import rhsu.board.xc.*;

public class Main
{	
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{	
		PrintUtilityDebugger debugger = new PrintUtilityDebugger(true);
		
		BasicMobilityBoard<Integer> test = new BasicMobilityBoard(5,5, 0);
		
		BasicMobilityPiece<Integer> pieceZero = (BasicMobilityPiece<Integer>) test.pieceAt(0,0);
		pieceZero.setValue(-99);
		
		test.move(pieceZero, 1, 1);
		
		debugger.print(test);
		debugger.print(pieceZero);
	}
}
