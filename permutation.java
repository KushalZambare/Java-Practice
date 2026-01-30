import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while(a>0){
            int n = in.nextInt();
            int[] p = new int[n + 1]; 

            int low = 1, high = n;

            for (int i = n; i >= 1; i--) {
                if ((n - i) % 2 == 0) {
                    p[i] = low;
                    low++;
            } 
            else {
                p[i] = high;
                high--;
            }
        }
            a--;

        for (int i = 1; i <= n; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
        }
    }
}
