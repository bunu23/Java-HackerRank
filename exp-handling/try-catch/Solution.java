package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        if(isWithinRange(x)&& isWithinRange(y)){
            if(y!=0){
                System.out.println(x/y);
            }else{
                throw new ArithmeticException("/ by zero");
            }
        }
        else{
            throw new InputMismatchException();
        }
    }
    catch(InputMismatchException e){
        System.out.println("java.util.InputMismatchException");
    }
    catch(ArithmeticException e){
         System.out.println("java.lang.ArithmeticException: " + e.getMessage());
    }
    }
    private static boolean isWithinRange(int num){
        return num >=Integer.MIN_VALUE && num <= Integer.MAX_VALUE;
    } 
    
}