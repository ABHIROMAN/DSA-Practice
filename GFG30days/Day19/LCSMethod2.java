package GFG30days.Day19;

public class LCSMethod2 {
    
    static String longestPalin(String S) {

        int n = S.length();

        String res = S.charAt(0) +  "";
        int max = 0;

        for(int i = 0; i < n; i++) {

            //Odd case 

            int l = i, r = i;

            while(l >= 0 && r < n && S.charAt(l) == S.charAt(r)) {

                if(r - l > max) {
                    res = S.substring(l, r+1);
                    max = r - l;
                }
                r++;
                l--;
            }

            //Even case
            l = i;
            r = i + 1;

            while(l >= 0 && r < n && S.charAt(l) == S.charAt(r)) {

                if(r - l > max) {
                    res = S.substring(l, r+1);
                    max = r - l;
                }
                r++;
                l--;
            }
        }
        return res;
    }
}
