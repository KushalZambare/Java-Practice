import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {

        // Creating BufferedReader object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Asking input
        System.out.print("Enter your name: ");

        // Reading input
        String name = br.readLine();

        // Printing output
        System.out.println("Hello " + name);
    }
}