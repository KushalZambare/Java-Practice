import java.util.*;

public class hashmap {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    HashMap<Integer, Integer> map = new HashMap<>();
    int n = arr.length;
    for(int i=0; i<n; i++){
        map.put(arr[i], i);
    }
    System.out.println(map);
   }
}
