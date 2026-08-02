public class Solution_605 {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 0, 0, 1};
        int n = 1;
        int count = 0;
        boolean canPlace = true;
        for(int i = 0; i < flowerbed.length; i++){
            int left = (i == 0) ? 0 : flowerbed[i - 1];
            int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
            if(left == 0 && right == 0 && flowerbed[i] == 0){
                flowerbed[i] = 1;
                count++;
            }
        }
        if(count >= n){
            canPlace = true;

        }
        else{
            canPlace = false;
        }
        System.out.println(canPlace);
    }
}
