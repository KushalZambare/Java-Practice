public class reversealternateword {
    public static void main(String[] args) {

        String str = "my name is xyz kushal";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() == 2) {
                System.out.print(words[i].charAt(1));
                System.out.print(words[i].charAt(0));
            } else {
                System.out.print(words[i]);
            }

            System.out.print(" ");
        }
    }
}