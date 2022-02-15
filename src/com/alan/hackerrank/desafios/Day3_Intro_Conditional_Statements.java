package com.alan.hackerrank.desafios;
import java.io.*;

public class Day3_Intro_Conditional_Statements {

	static void classifier(int N) {
		if(N % 2 != 0) {
			System.out.println("Weird");
		} else if(N % 2 == 0 && (N >= 2 && N <= 5)) {
			System.out.println("Not Weird");
		} else if (N % 2 == 0 && (N >= 6 && N <= 20)) {
			System.out.println("Weird");
		} else if (N % 2 == 0 && (N > 20)) {
			System.out.println("Not Weird");
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter int number: ");
		int N = Integer.parseInt(bufferedReader.readLine().trim());

		classifier(N);

		bufferedReader.close();
	}

}
