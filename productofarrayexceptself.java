import java.util.Arrays;

class productofarrayexceptself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int pdt = 1;
        for (int i = 0; i < n; i++) {
            res[i] = pdt;
            pdt *= nums[i];
        }
        pdt = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= pdt;
            pdt *= nums[i];
        }

        return res;
    }  
    public static void main(String[] args) {
            productofarrayexceptself obj = new productofarrayexceptself();
            int[] nums = {1, 2, 3, 4};
            int[] result = obj.productExceptSelf(nums);
            System.out.println(Arrays.toString(result));
    }       
}
