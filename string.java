import java.util.*;
import java.io.*;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int c = a.length();
        int d = b.length();
        System.out.println(c + d);

        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String e = a.substring(0,1).toUpperCase() + a.substring(1);
        String f = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(e + " " + f);
        System.out.println(" ");
    }
}
