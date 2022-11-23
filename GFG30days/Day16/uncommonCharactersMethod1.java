package GFG30days.Day16;

public class uncommonCharactersMethod1 {
    
    int max = 26;
    
    String uncommonChars(String A, String B) {

        int map1[] = new int[max];
        int map2[] = new int[max];

        int n = A.length();
        int m = B.length();

        for(int i = 0; i < n; i++) {
            map1[A.charAt(i) - 'a'] = 1;
        }

        for(int i = 0; i < m; i++) {
            map2[B.charAt(i) - 'a'] = 1;
        }

        String chars = "";
        for(int i = 0; i < 26; i++) {
            if((map1[i] ^ map2[i]) != 0) {
                chars += (char)(i + 'a');
            }
        }
        if(chars == "") return "-1";
        else return chars;
    }
}
