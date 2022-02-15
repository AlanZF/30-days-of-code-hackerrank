package com.alan.hackerrank.desafios;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day7_Arrays {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array length: ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
	    System.out.println("Elements of array - Example: 1 2 3 4 (for an array of size n=4): ");
	    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	          .map(Integer::parseInt)
	          .collect(toList());

        Collections.reverse(arr);
        
        for(int i = 0; i < n; i++) {
        	System.out.print(arr.get(i) + " ");
        }
        	
        bufferedReader.close();

	}
}
