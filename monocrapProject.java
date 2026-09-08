import java.util.Scanner;

public class monocrapProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long d = y - x;
            long project = 0;

            long count = Math.min(k, Math.max(0, d - x + 1));

            for (long i = 0; i < count; i++) {
                project += d % (x + i);
            }

            long remaining = k - count;

            project += remaining * d;

            System.out.println(project);
        }
    }
}