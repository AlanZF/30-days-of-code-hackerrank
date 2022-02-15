package com.alan.hackerrank.desafios;
import java.util.*;

public class Day4_Class_vs_Instance {
	
	private int age;

	public Day4_Class_vs_Instance(int initialAge) {
		this.age = initialAge;
		if(age < 0) {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}
		
	public void yearPasses() {
		this.age = this.age + 1;
	}
	
	public void amIOld() {
		if(this.age < 13) {
			System.out.println("You are young.");
		} else if (this.age >= 13 && this.age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of tests: ");
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			
			System.out.println("Enter the initial age: ");
			int age = sc.nextInt();
			
			Day4_Class_vs_Instance p = new Day4_Class_vs_Instance(age);
			p.amIOld();
			
			for(int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}
