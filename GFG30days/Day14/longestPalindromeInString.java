package GFG30days.Day14;

public class longestPalindromeInString {
    
    static boolean checkPalin(String a) {
        
        for(int i = 0; i < a.length()/2; i++) {
            
            if(a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    static String longestPalin(String S){
        // code here
        int max = 0;
        String m = "";
        
        for(int i = 0; i < S.length(); i++) {
            
            for(int j = i+1; j <= S.length(); j++) {
                
                if(S.substring(i,j).length() > max) {
                    
                    if(checkPalin(S.substring(i,j))) {
                        
                        m = S.substring(i,j);
                        max = S.substring(i,j).length();
                    }
                }
            }
        }
        return m;
    }
}
