import java.util.Arrays;
import java.util.Scanner;

public class mergearray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int n = arr1.length;
        int[] arr2 = {2,5,6};
        int m = arr2.length;
        int[] merged = new int[n + m];

        for(int i = 0; i< n; i++){
            merged[i] = arr1[i];
        }
        for(int j = 0; j< m; j++){
            merged[n + j] = arr2[j];
        }
        Arrays.sort(merged);
        for(int i = 0; i< merged.length; i++){
            System.out.print(merged[i] + " ");
        }
    }
}
