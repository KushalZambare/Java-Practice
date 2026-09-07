import java.util.ArrayList;
import java.util.Arrays;

public class mergeinterval {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if (currentStart <= end) {
                end = Math.max(end, currentEnd);
            } 
            else {
                result.add(new int[]{start, end});

                start = currentStart;
                end = currentEnd;
    }
        }

        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
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
