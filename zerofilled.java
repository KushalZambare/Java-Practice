public class zerofilled {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 2, 0, 0};
        long totalSubarrays = 0;
        long currentStreak = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                currentStreak++;
                totalSubarrays += currentStreak;
            } else {
                currentStreak = 0;
            }
        }

        System.out.println(totalSubarrays);
    }
}