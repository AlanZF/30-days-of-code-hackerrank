package com.alan.hackerrank.desafios;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Day2_Operators_Solution {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter meal cost: ");
		double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
		
		System.out.println("Enter meal tip percent: ");
		int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
		
		System.out.println("Enter meal tax percent: ");
		int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());
		
		Day2_Operators_Result.solve(meal_cost, tip_percent, tax_percent);
		
		bufferedReader.close();
	}

}
