import java.util.*;

public class wordBreakUsingDP {
    
    public static boolean wordBreak(String s, List<String> wordDict) {
        
        //converting to set
        HashSet<String> dict = new HashSet<>(wordDict);

        //Using dp 
        boolean[] flag = new boolean[s.length()+1];
        flag[0] = true;

        for(int i = 1; i <= s.length(); i++) {
            for(int j = 0; j<i; j++) {
                if(flag[j] && dict.contains(s.substring(j,i))) {
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[s.length()];

    }

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("leet");
        a.add("code");

        System.out.println(wordBreak("leetcode", a));
    }
}
