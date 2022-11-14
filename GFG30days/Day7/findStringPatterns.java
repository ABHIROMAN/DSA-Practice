package GFG30days.Day7;

public class findStringPatterns {
    
    static int numberOfSubsequences(String S, String W){
        
        int count = 0;
        
        boolean vis[] = new boolean[S.length()];
        
        for(int i = 0; i < S.length(); i++) {
            
            if(S.charAt(i) == W.charAt(0) && !vis[i]) {
                
                vis[i] = true;
                int k = 1;
                int j = i + 1;
                
                while(j < S.length() && k<W.length()) {
                    
                    if(S.charAt(j) == W.charAt(k) && !vis[j]) {
                        vis[j] = true;
                        k++;
                    }
                    j++;
                }
                if(k == W.length()) {
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
}
