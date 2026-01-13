import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        for (int i= start; i<= end-1; i++){
            if(i>= 0 && i < S.length()){
                System.out.print(S.charAt(i));
            }
        }
        System.out.println(" ");
        in.close();
    }
}