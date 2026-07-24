import java.util.ArrayList;

class solution{
    public int remove(int[] nums, int val){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                list.remove(i);
                i--;
            }
        }

        for (int i = 0; i< list.size(); i++){
            nums[i] = list.get(i);
        }

        return list.size();
    }
}

public class removeelement {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = sol.remove(nums, val);
        System.out.println("New length after removing " + val + ": " + newLength);
            
    }
}