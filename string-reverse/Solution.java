package hackerrank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        if(isPalindrom(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean isPalindrom(String s){ 
    int left=0;
    int right= s.length()-1;
    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}
