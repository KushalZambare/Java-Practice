import java.util.*;

public class youdelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        sc.nextLine();  // consume newline
        
        for (int test = 0; test < t; test++) {
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
        sc.close();
    }
    
    public static String solve(String s) {
        String best = null;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
            String afteralice = s.substring(0, i) + s.substring(i + 1);
            
            int first = -1;

            for(int j = 0; j < afteralice.length(); j++) {
                if (afteralice.charAt(j) == '1') {
                    first = j;
                    break;
                }
            }

            String finalstring = afteralice.substring(0, first) + afteralice.substring(first + 1);

            if (best == null || finalstring.compareTo(best) > 0) {
                best = finalstring;
            }
        }
        }
        return best;
    }
}