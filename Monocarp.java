import java.util.Scanner;

public class Monocarp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int count = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] == 0) {
                    count++;
                }
            }

            int len = a.length;

            if (a[0] == 0 && a[len - 1] == 0) {
                System.out.println(0);
            }
            else if (a[0] == 0 && a[len - 1] == 1 || a[0] == 1 && a[len - 1] == 0) {
                if (count > 1) {
                    System.out.println(1);
                }
                else {
                    System.out.println(-1);
                }
            }
            else if (a[0] == 1 && a[len - 1] == 0) {
                if (count >= 1) {
                    System.out.println(1);
                }
                else {
                    System.out.println(-1);
                }
            }
            else if (a[0] == 1 && a[len - 1] == 1) {
                if (count >= 2) {
                    System.out.println(2);
                }
                else {
                    System.out.println(-1);
                }
            }
            else {
                if (count >= 1) {
                    System.out.println(1);
                }
                else {
                    System.out.println(-1);
                }
            }
        }

    }
}