package GFG30days.Day18;

public class largestNumberPossible {
    
    static String findLargest(int N, int S){
        
        if(S == 0 && N > 1) {
            return "-1";
        }
        
        String ans = "";
        
        for(int i = 0; i < N; i++) {
            
            if(S >= 9) {
                ans +='9';
                S = S - 9;
            }
            else {
                ans += S;
                S = 0;
            }
        }
        if(S > 0) return "-1";
        return ans;
    }
}
