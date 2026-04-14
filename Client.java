import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {

        try {
            // Connect to server (localhost, port 5000)
            Socket s = new Socket("localhost", 5000);

            // Send data to server
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeUTF("Hello Server");

            // Close connection
            dos.close();
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}