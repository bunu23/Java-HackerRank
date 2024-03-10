package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           int lineNumber = 0;
  Scanner sc= new Scanner(System.in);
  


        while (sc.hasNext()) {
            String line = sc.nextLine();
            lineNumber++;
            System.out.println(lineNumber + " " + line);
        }

        sc.close();
    }
}