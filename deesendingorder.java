public class deesendingorder {
    public static void main(String[] args) {
    
        int num = 76985214;
        String numStr = Integer.toString(num);
        char[] numChars = numStr.toCharArray();
        java.util.Arrays.sort(numChars);
        String sorted = new StringBuilder(new String(numChars)).reverse().toString();
        int des = Integer.parseInt(sorted);
        System.out.println("The number in descending order is: " + des);
    
    }
    
}
