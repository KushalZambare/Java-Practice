import java.util.*;

public class inttostring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            int n = in.nextInt();

            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer, not text.");
        }
        finally {
            in.close();
            System.out.println("Scanner closed.");
        }
    }
}