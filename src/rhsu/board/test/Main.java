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
import rhsu.board.mobility.MobilityBoard;
import rhsu.board.mobility.MobilityPiece;
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
		
		MobilityBoard<Integer> board1 = MockFactory.mockMobilityBoard();
		MobilityBoard<Integer> board2 = MockFactory.mockMobilityBoard();
		
		MobilityPiece<Integer> pieceZero = (MobilityPiece<Integer>) board1.pieceAt(0, 0);
		pieceZero.setValue(-99);
		
		print(board1);
		
		print("line break");
		board1.move(pieceZero, 0, 0, board2);
		
		print(board1);
		print("line break");
		print(board2);
	}
}
