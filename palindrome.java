import java.io.*;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String res = "";
        for (int i = 0; i < A.length(); i++) {
        char c = A.charAt(i);
        res = c + res;
     }
     
     if (A.equals(res)){
        System.out.println("Yes");
     }
     else{
        System.out.println("No");
     }
     
    }
}



