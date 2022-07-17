import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    public static String returnName(String nameEmailInput) {
        
        String[] nameEmail = nameEmailInput.split(" ");
        
        String email = nameEmail[1];
        String name = nameEmail[0];
        
        if (email.contains("@gmail.com")) {
            return name;
        }
        return "";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
                
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] firstNameEmailID = new String[N];
        for (int NItr = 0; NItr < N; NItr++) {
            firstNameEmailID[NItr] = scanner.nextLine();
        }
        
        Arrays.sort(firstNameEmailID);
        
        String[] arrResult = new String[firstNameEmailID.length];
        for (int i = 0; i < firstNameEmailID.length; i++) {
            arrResult[i] = returnName(firstNameEmailID[i]);
            if (arrResult[i] != "") {
                System.out.println(arrResult[i]);
            }
        }
        
        scanner.close();
    }
}