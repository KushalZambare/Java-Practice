public class mergeinterval {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        for(int i = 0; i< intervals.length-1; i++){
            for(int j = i+1; j<intervals.length; j++){
                if (intervals[i][0]<intervals[j][1] && intervals[j][0]<intervals[i][1]){
                    intervals[i][0] = Math.min(intervals[i][0], intervals[j][0]);
                    intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
                    for(int k=j; k<intervals.length-1; k++){
                        intervals[k] = intervals[k+1];
                    }
                    int[][] newIntervals = new int[intervals.length-1][2];
                    for(int k=0; k<newIntervals.length; k++){
                        newIntervals[k] = intervals[k];
                    }
                    intervals = newIntervals;
                    j--;
                }
            }    
        }
        return intervals;
    }
    public static void main(String[] args) {
        mergeinterval obj = new mergeinterval();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged = obj.merge(intervals);
        for (int[] interval : merged) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
