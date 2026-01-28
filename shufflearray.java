import java.util.Scanner;

public class shufflearray{
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6};
        int n = 3;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[2*i] = num[i];
            ans[2*i+1] = num[i+n]; 
        }
        for (int k = 0;k< ans.length;k++){
            System.out.print(ans[k]+" ");
        }
    }
}