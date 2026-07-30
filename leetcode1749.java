class Leetcode1749 {
    public int subarray(int[] nums) {

        int totalSum = nums[0];

        int currMax = nums[0];
        int maxSum = nums[0];

        int currMin = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++){

            totalSum += nums[i];

            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }

    public static void main(String[] args) {
        Leetcode1749 leetcode1749 = new Leetcode1749();
        int[] nums = {1, -2, 3, -2};
        int result = leetcode1749.subarray(nums);
        System.out.println(result);
    }
}