import java.util.Arrays;

class productofarrayexceptself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int res[] = new int[n];
        Arrays.fill(res, 1);
        for(int i = 0; i< n; i++){
            if(nums[i] != 0){
                
            }
        }
        return res;
    }  
    public static void main(String[] args) {
            productofarrayexceptself obj = new productofarrayexceptself();
            int[] nums = {1, 2, 0, 4};
            int[] result = obj.productExceptSelf(nums);
            System.out.println(Arrays.toString(result));
    }       
}
