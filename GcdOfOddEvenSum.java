public class GcdOfOddEvenSum {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}