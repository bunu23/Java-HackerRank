package hackerrank;


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
     
        int count = 0;
        
       
        boolean inToken = false;
        
      
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                
                if (!inToken) {
                    
                    count++;
                    inToken = true;
                }
            } else {
               
                inToken = false;
            }
        }
        
        
        System.out.println(count);
        
        
        inToken = false;
        
        
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                
                System.out.print(c);
                inToken = true;
            } else {
                
                if (inToken) {
                    System.out.println();
                    inToken = false;
                }
            }
        }
        
       
        if (inToken) {
            System.out.println();
        }
        
     
        scan.close();
    }
}
