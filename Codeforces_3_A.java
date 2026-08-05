public class Codeforces_3_A {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int rounds = 0;
            
            while (a != b && b != c && a != c) {
                int largest = Math.max(a, Math.max(b, c));
                int smallest = Math.min(a, Math.min(b, c));
                
                if (largest == a) {
                    a--;
                    if (smallest == b) b++;
                    else c++;
                } else if (largest == b) {
                    b--;
                    if (smallest == a) a++;
                    else c++;
                } else {
                    c--;
                    if (smallest == a) a++;
                    else b++;
                }
                
                rounds++;
            }
            
            System.out.println(rounds);
        }
    }
}