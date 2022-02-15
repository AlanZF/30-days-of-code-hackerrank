package com.alan.hackerrank.desafios;
import java.util.*;

class Day2_Operators_Result {
		
	public static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip = (tip_percent * meal_cost)/100;
		double tax = (tax_percent * meal_cost)/100;
		
		double total_cost = meal_cost + tip + tax;
		System.out.println(Math.round(total_cost));
	}
}
