import java.util.Scanner;

public class nextround{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] score = new int[n];
        for(int i = 0; i<n; i++){
            score[i] = in.nextInt();
        }
        int ans = 0;
        int target = score[k-1];
        for(int j = 0; j<n;j++){
            if(score[j]>= target && score[j] > 0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}