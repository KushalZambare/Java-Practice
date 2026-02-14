public class triplet {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        boolean ans  = false;
        int n = nums.length;
        int first = Integer.MAX_VALUE;
        int second  = Integer.MAX_VALUE;
        for(int i = 0; i<n;i++){
            if(nums[i] <= first){
                first = nums[i];
            }
            else if(nums[i]<= second){
                second = nums[i];
            }
            else {
                ans = true;
            }
        }
        System.out.println(ans);
    }
}
