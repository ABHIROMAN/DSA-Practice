package GFG30days.Day5;

import java.util.*;

public class overlappingIntervals {
    
    static class pair{
        int start;
        int end;
        pair(int start,int end){
            this.start=start;
            this.end=end;
        }
        
        
    }
    public int[][] overlappedInterval(int[][] Intervals) {
        // Code here // Code here
        ArrayList<pair> al = new ArrayList<>();
        for(int i=0;i<Intervals.length;i++){
            al.add(new pair(Intervals[i][0],Intervals[i][1]));
            // System.out.println(Intervals[i][0]+"---"+Intervals[i][1]);
        }
        Collections.sort(al,(p1,p2)->{
            return (p1.start>p2.start)?1:-1;
        });
        
        ArrayList<pair> resA = new ArrayList<>();
        
        int k=0;
        int index=0;
        resA.add(new pair(al.get(index).start,al.get(index).end));
        for(int i=1;i<al.size();i++){
            // System.out.println(resA.size());
            if(resA.get(index).end>=al.get(i).start){
                int maxEnd = Math.max(resA.get(index).end,al.get(i).end);
                
                int start = resA.get(index).start;
                if(resA.size()>0)
                resA.remove(index);
                resA.add(new pair(start,maxEnd));
            }else{
                // resA.add(new pair(al.get(index).start,al.get(index).end));
                index++;
                resA.add(new pair(al.get(i).start,al.get(i).end));
            }
        }
        // System.out.println(index+" "+resA.size());
        int[][] res = new int[resA.size()][2];
        for(pair p:resA){
            res[k][0]=p.start;
            res[k][1]=p.end;
            k++;
        }
        
        return res;
    }
}
