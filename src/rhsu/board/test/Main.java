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
import rhsu.board.utilities.UtilityFunctions;
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
		
		BasicMobilityBoard<Integer> test = new BasicMobilityBoard<>(2,2, 0);
		
		BasicMobilityPiece<Integer> pieceZero = (BasicMobilityPiece<Integer>) test.pieceAt(0,0);
		BasicMobilityPiece<Integer> destination = (BasicMobilityPiece<Integer>) test.pieceAt(1,1);
		pieceZero.setValue(-99);
		destination.setValue(-999);

		//print(test);
		
		//print(UtilityFunctions.getCoordinate(destination));
		
		//test.move(pieceZero, 1, 1);
		
		//print(destination);
		//print(UtilityFunctions.getCoordinate(destination));
		
		print(pieceZero);
		print(destination);
		
		test.move(pieceZero, 1, 1);
		
		
		print(pieceZero);
		print(UtilityFunctions.getCoordinate(pieceZero));
		
		print(destination);
		print(UtilityFunctions.getCoordinate(destination));
		
		/*
		print(test);
		print("The coordinate of pieceZero is " + UtilityFunctions.getCoordinate(pieceZero));
		
		print("Setting coordinates to (1,1)");
		pieceZero.setHorizontal(1);
		pieceZero.setVertical(1);
		
		print("Moving pieceZero to (1,1)");
		print("Moving (1,1) to (0,0)");
		
		print("The coordinate of pieceZero is " + UtilityFunctions.getCoordinate(pieceZero));
		
		print(test);*/
	}
}
