import java.util.Scanner;

public class stringcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] arr = s.toCharArray();

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.print(count + "" + arr[i - 1] + " ");
                count = 1;
            }
        }

        System.out.print(count + "" + arr[arr.length - 1]);
    }
}