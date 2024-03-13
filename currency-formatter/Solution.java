package hackerrank;
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        NumberFormat usaFormatPayment=NumberFormat.getCurrencyInstance(Locale.US);
        String us=usaFormatPayment.format(payment);
        
        NumberFormat indiaFormatPayment=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india=indiaFormatPayment.format(payment);
        
        NumberFormat chinaFormatPayment=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=chinaFormatPayment.format(payment);
        
        NumberFormat francePaymentFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=francePaymentFormat.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}