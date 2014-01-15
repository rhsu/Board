package rhsu.board.test;

import rhsu.board.basic.implementations.StringBoard;
import rhsu.board.basic.implementations.CharBoard;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board.basic.BasicBoardPiece;
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
		MobilityBoard<Integer> board1 = new BasicMobilityBoard(5,5, 0);
		MobilityBoard<Integer> board2 = new BasicMobilityBoard(5,5, 0);
		
		board1.setValueAt(0,0, -99);
		
		
		print(board1);
		print("-----");
		
		board1.move((MobilityPiece<Integer>) board1.pieceAt(0,0), 1, 1, board2);
		
		print(board1);
		print("-----");
		print(board2);
	}
}
