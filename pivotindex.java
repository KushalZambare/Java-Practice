public class pivotindex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int pivotIndex = findPivotIndex(nums);
        System.out.println("Pivot Index: " + pivotIndex);
    }

    public static int findPivotIndex(int[] nums) {
        int totalSum = 0;
        int n = nums.length;
        for (int num : nums) {
            totalSum += num;
        }
        int rightsum = totalSum;
        int leftsum = 0;
        for(int i = 0 ; i < n; i++){
            rightsum -= nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

}
