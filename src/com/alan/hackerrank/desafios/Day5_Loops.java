package com.alan.hackerrank.desafios;
import java.io.*;

public class Day5_Loops {
	
	static void printMultiples(int n) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number: ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        printMultiples(n);

        bufferedReader.close();

	}

}
