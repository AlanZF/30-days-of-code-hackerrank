package com.alan.hackerrank.desafios;
import java.util.*;

public class Day6_Lets_Review {
	
	static void printEven(String s) {
		char[] letters = s.toCharArray();
		
		for(int i = 0; i < letters.length; i++) {
			if(i % 2 == 0) {
				System.out.print(letters[i]);
			}
		}
	}
	
	static void printOdd(String s) {
		char[] letters = s.toCharArray();
		
		for(int i = 0; i < letters.length; i++) {
			if(i % 2 != 0) {
				System.out.print(letters[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of tests: ");
		int T = sc.nextInt();
		
		while(T-- > 0) {
			System.out.println("Enter with a word: ");
			String word = sc.next();
		
			printEven(word);
			System.out.print(" ");
			printOdd(word);
			
			System.out.println();
		}
		
		sc.close();

	}
}
