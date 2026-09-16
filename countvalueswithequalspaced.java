import java.util.*;
public class countvalueswithequalspaced {
    public int countValuesWithEqualSpaced(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }

            map.get(nums[i]).add(i);
        }

        int count = 0;

        for (int x : map.keySet()) {
            ArrayList<Integer> indx = map.get(x);

            if (indx.size() == 3) {
                int i1 = indx.get(0);
                int i2 = indx.get(1);
                int i3 = indx.get(2);

                if (i2 - i1 == i3 - i2) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        countvalueswithequalspaced counter = new countvalueswithequalspaced();
        int[] nums = {1, 3, 1, 7, 1};
        int result = counter.countValuesWithEqualSpaced(nums);
        System.out.println("Count of values with equal spacing: " + result);
    }
}
