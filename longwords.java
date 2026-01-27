import java.util.Scanner;

public class longwords{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        if(!in.hasNextLine()) return;
        int a = in.nextInt();

        if(a < 1 || a > 100){
            return;
        }
        
        while(a>0){
            String s = in.next();
            char[] arr = s.toCharArray();
            int n = arr.length;
            if(n>10){
                int m = n-2;
                System.out.println("" + arr[0] + m + arr[n-1]);
            }
            else{
                System.out.println(s);
            }
            a--;
        }
    }
}