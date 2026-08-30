class movezero{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int nonzero = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonzero];
                nums[nonzero] = nums[i];
                nums[i] = temp;
                nonzero++;
            }
        }
    }
}