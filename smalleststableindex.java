public class smalleststableindex {          
    public int smallestStableIndex(int[] nums, int k) {         
        int n = nums.length;
        if (n == 0) return -1;
        
        int[] left = new int[n];
        left[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            left[i] = Math.min(nums[i], left[i + 1]);
        }
        
        
        int right = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            right = Math.max(right, nums[i]);
            
            if (right - left[i] <= k) {
                return i;
            }
        }
        
        return -1;     
    } 

    public static void main(String[] args) {         
        smalleststableindex obj = new smalleststableindex();         
        int[] nums = {5, 0, 1, 4};         
        int k = 3;         
        int result = obj.smallestStableIndex(nums, k);         
        System.out.println("Smallest Stable Index: " + result);     
    }
}
