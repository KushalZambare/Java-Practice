import java.util.Scanner;

public class Petya_Strings{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        int com = s1.compareTo(s2);
        if(com < 0){
            System.out.println("-1");
        }
        else if(com>0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}