public class Consoleinput {
    public static void main(String[] args) {

        // Getting console object
        java.io.Console c = System.console();

        // Reading input
        String name = c.readLine("Enter your name: ");

        // Printing output
        System.out.println("Hello " + name);
    }
}