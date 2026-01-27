import java.util.Scanner;

public class team{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        
        while(n>0){
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a == 1 || a == 0 && b == 1 || b== 0&& c == 1|| c==0){

        if(a+b+c >= 2){
            ans = ans+1;
        }
        n--;
        }
        }
        System.out.println(ans);
    }
}