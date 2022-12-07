package GFG30days.Day25;

public class implementSTRSTR {
    
    int strstr(String s, String x) {

        int m = s.length();
        int n = x.length();

        for(int i = 0; i <= m-n; i++) {

            String ans = s.substring(i, i+n);
            if(x.equals(ans)) {
                return i;
            }
        }
        return -1;
    }
}
