public class hourglass{
    public static void main(String[] args) {
    
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<=mat.length-3; i++){
            for(int j=0; j<=mat[0].length-3; j++){
                int sum = mat[i][j] + mat[i][j+1] + mat[i][j+2] +
                          mat[i+1][j+1] +
                          mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2];
                maxsum = Math.max(maxsum, sum);
            }
        }
        System.out.println(maxsum);
    }
}