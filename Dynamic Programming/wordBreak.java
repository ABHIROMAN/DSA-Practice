import java.util.*;

public class wordBreak {

    public static boolean wordBreaking(String s, List<String> wordDict) {

        HashMap<String, Boolean> map = new HashMap<>();

        return helper(s, wordDict, map);
    }

    public static boolean helper(String target, List<String> words, HashMap<String, Boolean> map) {

        if(map.containsKey(target)) return map.get(target);

        if(target.isEmpty()) return true;

        for(String word : words) {
            if(target.startsWith(word)) {
                if(helper(target.substring(word.length()), words, map)) {
                    map.put(target, true);
                    return true;
                }
            }
        }
        map.put(target, false);
        return false;

    }

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("leet");
        a.add("code");

        System.out.println(wordBreaking("leetcode", a));
    }
}
