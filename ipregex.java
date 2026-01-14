import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ipregex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ipPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(ipPattern);
        while(scanner.hasNextLine()) {
        String input = scanner.nextLine().trim();
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

        scanner.close();
    }
}
