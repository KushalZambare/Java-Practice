import java.util.Arrays;

public class runningsum {
    public static int[] runningSum(int[] nums) {
        int[] run = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            run[i] = sum;
        }
        return run;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}