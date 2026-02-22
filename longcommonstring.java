import java.util.Arrays;

public class longcommonstring {
    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String a = strs[0];
        int n = strs.length;
        String b = strs[n-1];
        int i = 0;
        while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) {
            i++;
        }
        return a.substring(0, i);
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight", "Kushal"};
        System.out.println(longestCommonPrefix(strs));
    }
}