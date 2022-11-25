package GFG30days.Day18;

import java.util.*;

class Node {
    
    int start;
    int end;
    
    Node(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class NmeetingsInOneroom {
    
    public static int maxMeetings(int start[], int end[], int n) {
        
        Node [] node = new Node[n];

        for(int i = 0; i<n; i++) {
            node[i] = new Node(start[i], end[i]);
        }

        Arrays.sort(node, (a,b) -> (a.end == b.end) ? a.start - b.start: a.end - b.end);

        int count = 1;
        int endPoint = node[0].end;

        for(int j = 1; j < n; j++) {
            if(node[j].start > endPoint) {
                count++;
                endPoint = node[j].end;
            }
        }

        return count;
        
    }
}
