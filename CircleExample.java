import java.util.Scanner; // Import Scanner for input

// Class to calculate circle properties
class Circle {

    double radius; // Variable to store radius

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius; // Formula: πr²
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 2 * Math.PI * radius; // Formula: 2πr
    }
}

public class CircleExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object

        Circle c = new Circle(); // Create object of Circle class

        // Taking input
        System.out.print("Enter radius: ");
        c.radius = sc.nextDouble();

        // Calling methods
        double area = c.calculateArea();
        double perimeter = c.calculatePerimeter();

        // Display results
        System.out.println("Area of Circle: " + area);
        System.out.println("Perimeter of Circle: " + perimeter);

        sc.close(); // Close scanner
    }
}