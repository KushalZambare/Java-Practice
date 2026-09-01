import java.util.Arrays;

class squareofarray{
    public int[] square(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[i] = arr[i] * arr[i];
        }
        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args){
        squareofarray obj = new squareofarray();
        int[] arr = {-4, -1, 0, 3, 10};
        int[] squaredArr = obj.square(arr);
        for(int i=0; i<squaredArr.length; i++){
            System.out.print(squaredArr[i] + " ");
        }
    }
}