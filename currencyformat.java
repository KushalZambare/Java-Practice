import java.io.*;
import java.util.*;
import java.text.*;

public class currencyformat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.of("hi","IN"));
        String india = n1.format(payment);
        
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n2.format(payment);
        
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.of("zh","CN"));
        String china = n3.format(payment);
        
        NumberFormat n4 = NumberFormat.getCurrencyInstance(Locale.of("fr","FR"));
        String france = n4.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}