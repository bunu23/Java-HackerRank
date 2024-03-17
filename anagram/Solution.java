package hackerrank;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        int alength=a.length();
        int blength=b.length();
        
        if(alength!=blength)
            return false;
       
        a=a.toLowerCase();
        b=b.toLowerCase();
        
       int[] char_freq=new int[26];
       
       for(int i=0;i<alength;i++){
           char currentchar=a.charAt(i);
           int index=currentchar-'a';
           char_freq[index]++;
         }
       
        for(int i=0;i<blength;i++){
           char currentchar=b.charAt(i);
           int index=currentchar-'a';
           char_freq[index]--;
         }
       for(int i=0;i<26;i++){
           if(char_freq[i]!=0) return false;
       }
       return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}