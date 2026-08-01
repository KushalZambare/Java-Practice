import java.util.*;

public class MergeToMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int test = 0; test < t; test++) {
            // Read n and m
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            // Read array a
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Read array b
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            
            // Sort both arrays
            Arrays.sort(a);
            Arrays.sort(b);
            
            boolean possible = true;
            
            for (int i = 0; i < m; i++) {
                if (i >= n || a[i] > b[i]) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}