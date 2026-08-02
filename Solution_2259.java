public class Solution_2259 {
    public static void main (String[] args) {
        String num = "1231";
        int digit = '1';
        String maxNum = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == digit) {
                String newNum = num.substring(0, i) + num.substring(i + 1);
                if (newNum.compareTo(maxNum) > 0) {
                    maxNum = newNum;
                }
            }
        }
        System.out.println(maxNum);
    }
}