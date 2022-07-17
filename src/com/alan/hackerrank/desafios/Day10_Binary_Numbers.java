import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    static int bigSequence = 0;
    
    static int solve(int n) {
        String binary = Integer.toBinaryString(n);
        String[] sequence = binary.split("0");
        
        bigSequence = sequence[0].length();
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i].length() > bigSequence) {
                bigSequence = sequence[i].length();
            }
        }
        return bigSequence;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = solve(n);
        System.out.println(result);

        scanner.close();
    }
}