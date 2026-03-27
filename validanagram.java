import java.util.*;

public class validanagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean check = false;
        
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        
        int n = str1.length;
        int m = str2.length;

        if(n != m){
            check = false;
            System.out.println(check);
        }
        else {
            Arrays.sort(str1);
            Arrays.sort(str2);
            
            check = Arrays.equals(str1, str2);
            System.out.println(check);
        }
    }
}