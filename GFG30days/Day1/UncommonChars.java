package GFG30days.Day1;

public class UncommonChars {
    
    int max = 26;
    String UncommonCharacter(String a, String b) {

        int map1[] = new int[max];
        int map2[] = new int[max];

        int n = a.length();
        int m = b.length();

        for(int i = 0; i < n; i++) {
            map1[a.charAt(i) - 'a'] = 1;
        }

        for(int i = 0; i < m; i++) {
            map2[a.charAt(i) - 'a'] = 1;
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
