import java.util.Scanner;

public class domino{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int a = m*n;
        int x = a/2;
        System.out.println(x);
    }
}