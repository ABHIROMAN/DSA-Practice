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

public class NmeetimgsMethod2 {
    
    public static int maxMeetings(int start[], int end[], int n) {

        Node nodes[] = new Node[n];

        for(int i = 0; i < n; i++) {

            nodes[i] = new Node(start[i], end[i]);
        }
        
        nodes = Arrays.stream(nodes).sorted((p1, p2) -> {
            
            if(p1.start != p2.start) {
                return p1.start - p2.start;
            }
            return p1.end - p2.end;
        }).toArray(Node[]::new);

        int ans = 0, prev = -1, i = 0;
        while(i < n) {

            if(nodes[i].start > prev) {
                prev = nodes[i].end;
                ans++;
            } else {
                prev = Math.min(prev, nodes[i].end);
            }
            i++;
        }
        return ans;
    }
}
