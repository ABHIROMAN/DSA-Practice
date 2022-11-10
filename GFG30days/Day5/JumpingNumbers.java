package GFG30days.Day5;

import java.util.*;

public class JumpingNumbers {

    static long jumpingNums(long X) {
        long ans = 1;
 
         Queue<Long> queue = new LinkedList<>();
 
         for(long i=1; i<10; i++){
 
             queue.add(i);
 
         } 
 
         while(!queue.isEmpty()){
 
             long elem = queue.remove();
 
             if(elem == X) return elem;
 
             if(elem > X) break;
 
             ans = Math.max(ans, elem);
 
                 
 
             long lastdigit = elem % 10;
 
             long first = elem*10 + (lastdigit - 1);
 
             long second = elem*10 + (lastdigit + 1);
 
             if(lastdigit > 0){
 
                 queue.add(first);
 
             }
 
             if(lastdigit < 9){
 
                 queue.add(second);
 
             }
 
             ans = elem;
 
         }
 
         return ans;
     }
    
};
