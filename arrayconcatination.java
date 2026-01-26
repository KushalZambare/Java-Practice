public class arrayconcatination {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int n = arr1.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr1[i];
            ans[i + n] = arr1[i];
        }
        return ans;
    }
}