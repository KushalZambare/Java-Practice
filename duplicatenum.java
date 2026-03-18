import java.util.Arrays;

public class duplicatenum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int n = nums.length; 
        boolean check = false;  
        
        Arrays.sort(nums);
        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                check = true;
            }
        }
        System.out.println(check);
    }
    
}
