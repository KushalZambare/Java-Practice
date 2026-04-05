import java.io.*;

// Serializable class
class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationExample {
    public static void main(String[] args) {

        try {
            // Creating object
            Student s1 = new Student(1, "Kushal");

            // Writing object to file
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1); // Serialize object

            oos.close();
            fos.close();

            System.out.println("Object Serialized");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}