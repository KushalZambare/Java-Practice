class meetingroom{
    public boolean canattend(int[][] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i][0]<arr[j][1] && arr[j][0]<arr[i][1]){
                    return false;
                    }
                }
            }
           return true;
        } 
    public static void main(String[] args){
        meetingroom obj = new meetingroom();
        int[][] arr = {{1, 4}, {10, 15}, {7, 10}};
        System.out.println(obj.canattend(arr));
    }
}
