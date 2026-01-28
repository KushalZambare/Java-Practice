import java.util.Scanner;

public class defang {
    public static void main(String[] args){
        String address = "1.1.1.1";
        String changed = address.replace(".", "[.]");
        System.out.println(changed);
    }
}