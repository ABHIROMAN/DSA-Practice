package GFG30days.Day15;

import java.util.*;

public class ActivitySelectionProblem {
    
    static class Activity {
        int start;
        int end;

        Activity(int x, int y) {
            start = x;
            end = y;
        }
    }

    public static int activitySelection(int start[], int end[], int n) {

        Queue<Activity> q = new PriorityQueue<>((a, b) -> a.end - b.end);

        for(int i = 0; i <= n; i++) {
            q.add(new Activity(start[i], end[i]));
        }
        int res = 1;

        Activity prev = q.poll();
        while(!q.isEmpty()) {

            Activity curr = q.poll();
            if(curr.start > prev.end) {
                res++;
                prev = curr;
            }
        }

        return res;
    }
}
