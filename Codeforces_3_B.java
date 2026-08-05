import java.util.*;

public class Codeforces_3_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            int groups = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1))
                    groups++;
            }

            int ans = groups;

            for (int i = 1; i <= n - 2; i++) {

                char left = s.charAt(i - 1);
                char mid = s.charAt(i);
                char right = s.charAt(i + 1);

                if (left != mid && mid != right) {
                    if (left == right) {
                        ans = Math.min(ans, groups - 2);
                    } else {
                        ans = Math.min(ans, groups - 1);
                    }
                }
            }

            System.out.println(ans);
        }
    }
}