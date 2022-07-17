import java.io.*;
import java.util.*;

public class Solution {
    
    static int calculateFine(int[] returned, int[] due) {
        
        int fine = 0;
        
        int dayR = returned[0];
        int monthR = returned[1];
        int yearR = returned[2];

        int dayD = due[0];
        int monthD = due[1];
        int yearD = due[2];
        
        if (dayR <= dayD && monthR <= monthD && yearR <= yearD) {
            fine = 0;
        } else if (dayR > dayD && monthR == monthD && yearR == yearD){
            fine = 15 * (dayR - dayD);
        } else if ((dayR < dayD || dayR >= dayD) && monthR > monthD &&                      yearR == yearD) {
            fine = 500 * (monthR - monthD);
        } else if ((dayR < dayD || dayR >= dayD) && (monthR < monthD ||                     monthR >= monthD) && yearR > yearD){
            fine = 10000;
        }
        return fine;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] dateR = input.nextLine().split(" ");
        String[] dateD = input.nextLine().split(" ");
        
        int[] dR = new int[3];
        for (int i = 0; i < dR.length; i++) {
            dR[i] = Integer.parseInt(dateR[i]);
        }
        
        int[] dD = new int[3];
        for (int i = 0; i < dD.length; i++) {
            dD[i] = Integer.parseInt(dateD[i]);
        }
        
        System.out.println(calculateFine(dR, dD));
        
        input.close();
    }
}