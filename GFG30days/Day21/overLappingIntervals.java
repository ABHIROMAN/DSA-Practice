package GFG30days.Day21;

import java.util.*;

public class overLappingIntervals {
    
    static class Pair {
        int start; 
        int end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int[][] overlappedInterval(int[][] Intervals) {

        Arrays.sort(Intervals, (a,b) -> a[0]-b[0]);

        int start = Intervals[0][0];
        int end = Intervals[0][1];

        List<Pair> list = new ArrayList<>();
        for(int i = 0; i < Intervals.length; i++) {

            if(Intervals[i][0] <= end) {
                end = Math.max(end, Intervals[i][1]);
            }
            else {
                list.add(new Pair(start, end));
                start = Intervals[i][0];
                end = Intervals[i][1];
            }
        }
        
        list.add(new Pair(start, end));
        int res[][] = new int[list.size()][2];

        for(int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i).start;
            res[i][1] = list.get(i).end;
        }

        return res;
     }
}
