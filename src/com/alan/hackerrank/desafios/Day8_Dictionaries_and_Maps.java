//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        //creating the HashMap
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
  
        // entering data name and phone in the HashMap
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            phoneBook.put(name, phone);
        }
        
        // generating the output
        while(in.hasNext()){
            String s = in.next();
            Object result = phoneBook.get(s);
            if (result != null) {
                System.out.println(s + "=" + result);
            } else {
                System.out.println("Not found");
            }
            
        }
        
        in.close();
    }
}