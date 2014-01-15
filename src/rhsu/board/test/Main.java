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
import rhsu.board.implementations.basic.arithmetic.IntegerBoard;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board.xc.*;

public class Main
{	
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{	
		AbstractBasicBoard<Integer> board = new IntegerBoard(5,5,0);
		
		board.pieceAt(0,0).setValue(-99);
		
		board.modifyPieceAt(1, 1, board.pieceAt(0,0));
		
		//BoardPiece<Integer>[][] test = board.getBoard();
		
		//test[0][0] = new BasicBoardPiece<>(0,0, -99);
		
		//print(board.pieceAt(0,0).getHorizontal());
		//print(board.pieceAt(0,0).getVertical());
		
		board.pieceAt(0,0).setValue(55);
		print(board.pieceAt(0,0) == board.pieceAt(1,1));
		
		print(board);
	}
}
