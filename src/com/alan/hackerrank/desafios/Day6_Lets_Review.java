import java.util.*;

public class Solution {
    
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
        
        int T = sc.nextInt();
        
        while(T-- > 0) {
            String word = sc.next();
        
            printEven(word);
            System.out.print(" ");
            printOdd(word);
            
            System.out.println();
        }
        
        sc.close();
    }
}