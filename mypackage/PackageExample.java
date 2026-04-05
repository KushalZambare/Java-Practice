package mypackage;

public class PackageExample {

    public void display() {
        System.out.println("This is package example");
    }
    
    // Add this main method
    public static void main(String[] args) {
        PackageExample obj = new PackageExample();
        obj.display();
    }
}