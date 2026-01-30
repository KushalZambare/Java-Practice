import java.util.Scanner;
class candies{
	public static void main (String[] args){ 
		int[] candies = {2,3,5,1,3};
		int extra = 3;
		int n = candies.length;
		boolean[] arr = new boolean[n];
		int high = candies[0];
		for(int i = 0; i<n; i++){
		    if(candies[i]> high){
		        high = candies[i];
		    }
		}
		for(int i = 0; i<n;i++){
		    if((candies[i] + extra) >= high){
		        arr[i] = true;
		    }
		    else {
		        arr[i] = false;
		    }
		}
	    System.out.print("[");
        for(int j=0; j< n; j++){
            System.out.print(arr[j]);
            if(j<n-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
	}
}
