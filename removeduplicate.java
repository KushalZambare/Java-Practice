public class removeduplicate {
    public int removeDuplicates(int[] nums) {
       if(nums.length == 0) return 0;
       int unique = 1;
       int n = nums.length;
       for(int i=1; i< n; i++){
        if(nums[i] != nums[i-1]){
            nums[unique] = nums[i];
            unique++;
            }
       }
       return unique;
    }

    public static void main(String[] args) {
        removeduplicate obj = new removeduplicate();
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int uniqueCount = obj.removeDuplicates(nums);
        System.out.println("Number of unique elements: " + uniqueCount);
    }
}
      