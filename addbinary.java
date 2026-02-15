public class addbinary {

    public static String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String res = "";

        while (i >= 0 || j >= 0) {

            char bitA = '0';
            char bitB = '0';

            if (i >= 0) {
                bitA = a.charAt(i);
            }

            if (j >= 0) {
                bitB = b.charAt(j);
            }

            if (bitA == '0' && bitB == '0') {
                if (carry == 0) {
                    res = "0" + res;
                } else {
                    res = "1" + res;
                    carry = 0;
                }
            }

            else if ((bitA == '1' && bitB == '0') ||
                     (bitA == '0' && bitB == '1')) {

                if (carry == 0) {
                    res = "1" + res;
                } else {
                    res = "0" + res;
                    carry = 1;
                }
            }

            else if (bitA == '1' && bitB == '1') {
                if (carry == 0) {
                    res = "0" + res;
                    carry = 1;
                } else {
                    res = "1" + res;
                    carry = 1;
                }
            }

            i--;
            j--;
        }

        if (carry == 1) {
            res = "1" + res;
        }

        return res;
    }

    public static void main(String[] args) {

        String a = "1010";
        String b = "1011";

        String res = addBinary(a, b);
        System.out.println(res);
    }
}
