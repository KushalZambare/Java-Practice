public class RectanglePattern {
    public static void main(String[] args) {

        int rows = 4;     // Number of rows
        int columns = 6;  // Number of columns

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for columns
            for (int j = 1; j <= columns; j++) {

                System.out.print("* "); // Print star

            }

            System.out.println(); // Move to next line after each row
        }
    }
}