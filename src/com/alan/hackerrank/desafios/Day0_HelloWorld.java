package com.alan.hackerrank.desafios;
import java.util.*;
public class Day0_HelloWorld {

	public static void main(String[] args) {
		
		String inputString;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter with the String: ");
		inputString = scan.nextLine();
		
		System.out.println("Hello, World.");
		System.out.println(inputString);
		
		scan.close();
	}

}
