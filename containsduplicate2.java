public class containsduplicate2 {
    public static void main(String[] args){
        int[] num = {1,0,1,1};
        int n = num.length;
        int k = 4;
        boolean check = false;
        for(int i = 0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(num[i] == num[j] && Math.abs(i-j)<= k){
                    check = true;
                }
            }
        }
        System.out.println(check);
    }
}
