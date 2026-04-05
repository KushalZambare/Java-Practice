public class ExceptionExample {
    public static void main(String[] args) {

        try {
            int a = 10, b = 0;

            int result = a / b; // Error (divide by zero)

            System.out.println(result);
        }
        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Execution Completed");
        }
    }
}