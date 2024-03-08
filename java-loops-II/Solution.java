package hackerrank;
import java.util.*;
import java.io.*;


class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a, b, n);
        }
        in.close();
    }
    
    private static void printSeries(int a, int b, int n){
        
        int res=a;
          for(int k=0;k<n;k++){
              res += Math.pow(2, k) * b;
              System.out.print(res+" ");
          }
          System.out.println();
         
     }
     
     
 }