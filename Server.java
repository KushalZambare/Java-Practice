import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {

        try {
            // Create ServerSocket on port 5000
            ServerSocket ss = new ServerSocket(5000);

            System.out.println("Server is waiting for client...");

            // Accept client connection
            Socket s = ss.accept();

            System.out.println("Client connected");

            // Read data from client
            DataInputStream dis = new DataInputStream(s.getInputStream());

            String msg = dis.readUTF();

            System.out.println("Message from client: " + msg);

            // Close connection
            dis.close();
            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}