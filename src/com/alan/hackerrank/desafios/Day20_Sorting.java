import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static void sort(int[] arr) {
        int numSwaps = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                    numSwaps++;
                }
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] a = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        sort(a);
        in.close();
    }
}