public class maxlengthproduct {
    public int[] maxProduct(int[] nums, int target) {
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;
        int[] result = {-1, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    continue;
                }

                if (nums[i] > nums[j] && nums[i] + nums[j] == target) {
                    int product = nums[i] * nums[j];
                    if (product > maxProd) {
                        maxProd = product;
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        maxlengthproduct mp = new maxlengthproduct();

        System.out.println(java.util.Arrays.toString(mp.maxProduct(new int[]{1, 2, 3, 4}, 5)));   // [2, 1]
        System.out.println(java.util.Arrays.toString(mp.maxProduct(new int[]{-3, -1, 4, 2}, 1))); // [3, 1]
        System.out.println(java.util.Arrays.toString(mp.maxProduct(new int[]{3, 3, 5}, 6)));      // [-1, -1]
    }
}