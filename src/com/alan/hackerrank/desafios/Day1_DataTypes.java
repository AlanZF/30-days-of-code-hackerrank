package com.alan.hackerrank.desafios;
import java.util.*;

public class Day1_DataTypes {

	public static void main(String[] args) {
		
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		
		int secondInt;
		double secondDouble;
		String secondString;
		
		System.out.println("Enter second int: ");
		secondInt = scan.nextInt();
				
		System.out.println("Enter second double: ");
		secondDouble = scan.nextDouble();
		
		System.out.println("Enter second String: ");
		secondString = scan.nextLine();
		
		System.out.println(i + secondInt);
		System.out.println(d + secondDouble);
		System.out.println(s + secondString);
		
		scan.close();
	}

}
