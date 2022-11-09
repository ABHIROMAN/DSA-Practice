package GFG30days.Day4;

public class longestCommonPrefixInAnArray {

    String compareTwo(String A, String B) {

        String pre = "";
        int i = 0;

        while(i < A.length() && i < B.length()) {
            if(A.charAt(i) == B.charAt(i)) {
                pre += A.charAt(i);
            }
            else break;
            i++;
        }
        return pre;
    }
    String longestCommonPrefix(String arr[], int n) {

        String pre = arr[0];

        for(int i = 0; i < n; i++) {
            pre = compareTwo(pre, arr[i]);
        }

        if(pre == "") return "-1";
        return pre;
    }
    
}
