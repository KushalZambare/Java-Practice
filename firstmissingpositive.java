import java.util.Arrays;

public class firstmissingpositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == res) {
                res++;
            }
            else if(nums[i]> res){
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        firstmissingpositive solution = new firstmissingpositive();
        int[] nums = {3, 4, -1, 1};
        int result = solution.firstMissingPositive(nums);
        System.out.println(result); // Output: 2
    }
}
