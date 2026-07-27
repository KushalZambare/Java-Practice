public class MaxSubArray{
    public static void main(String [] args){
        int[] nums = {1,-5,4,-1,-2,6};

        int sum = nums[0];
        int max = nums[0];

        for(int i=1; i< nums.length;i++){
            sum = Math.max(nums[i], sum+nums[i]);
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
}