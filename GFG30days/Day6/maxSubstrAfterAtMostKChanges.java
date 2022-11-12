package GFG30days.Day6;

public class maxSubstrAfterAtMostKChanges {
    
    public int findLen(String A, int n, int k, char ch) {

        int maxlen = 1;
        int cnt = 0;
        int l = 0, r = 0;

        while (r < n) {

            if(A.charAt(r) != ch) 
                ++cnt;
            
                while(cnt > k) {
                    if(A.charAt(l) != ch) 
                        --cnt;
                        ++l;
                }
                maxlen = Math.max(maxlen, r - l + 1);
                ++r;
        }
        return maxlen;
    }

    public int characterReplacement(String s, int k) {

        int n = s.length();

        int maxlen = 1;
        for(int i = 0; i < 26; ++i) {

            maxlen = Math.max(maxlen, findLen(s, n, k, (char)(i + 'A')));
            maxlen = Math.max(maxlen, findLen(s, n, k, (char)(i + 'a')));
        } 
        return maxlen;
    }
}
