package hackerrank;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
 int sum=A.length()+B.length();
 System.out.println(sum);
 
 if(A.compareTo(B)>0){
   System.out.println("Yes");
 }
 else{
     System.out.println("No");
 }
 String firstLetterCapitalizedA=capitalizeFirstLetter(A);
 String firstletterCapitalizedB=capitalizeFirstLetter(B);
 System.out.println(firstLetterCapitalizedA +" "+ firstletterCapitalizedB);
 
    }
 private static String capitalizeFirstLetter(String s){
     if(s==null || s.isEmpty()){
         return s;
     }
     return Character.toUpperCase(s.charAt(0))+s.substring(1);
     
   
   }
}
