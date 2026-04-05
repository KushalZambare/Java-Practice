import java.util.Scanner; // Import Scanner class

public class ScannerInput {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Asking user input
        System.out.print("Enter your name: ");

        // Reading input
        String name = sc.nextLine();

        // Display output
        System.out.println("Hello " + name);

        // Closing scanner
        sc.close();
    }
} 
