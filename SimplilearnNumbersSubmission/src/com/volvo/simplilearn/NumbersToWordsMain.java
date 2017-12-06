package com.volvo.simplilearn;

import java.util.Scanner;

public class NumbersToWordsMain {
	public static void main( String args[]) {
		
		ConvertNumberToWords obJ = new ConvertNumberToWords();
		System.out.println("Enter a number between 0 to 999 to convert to words");
		Scanner reader = new Scanner(System.in);
		String intNumber = reader.next();		
		String inWords = obJ.convertToWords(intNumber);
		System.out.println(inWords);
	}

}
