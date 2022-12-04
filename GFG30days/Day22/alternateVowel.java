package GFG30days.Day22;

public class alternateVowel {
    
    public String rearrange(String s, int N) {

        int countVow = 0;
        int countCons = 0;

        for (char c : s.toCharArray()) {
            if(c == 'a' || c == 'e' ||  c == 'i' || c == 'o' ||  c == 'u')
                countVow++;
            else countCons++;
        }

        if(Math.abs(countVow - countCons) != 0 && Math.abs(countVow - countCons) != 1)
            return "-1";

        int hashVow[] = new int[26];
        int hashCons[] = new int[26];

        for (char c : s.toCharArray()) {
            if(c == 'a' || c == 'e' ||  c == 'i' || c == 'o' ||  c == 'u') {
                hashVow[c-'a']++;
            } else {
                hashCons[c-'a']++;
            }
        }

        char[] chars = new char[s.length()];
        int k = 0;

        if (countVow == countCons) {
            int firstVow = 0;
            int firstCons = 0;

            firstVow = getFirstOccurrence(hashVow);
            firstCons = getFirstOccurrence(hashCons);

            k = firstVow < firstCons ? 0 : 1;
            create(chars, hashVow, k);

            k = firstVow < firstCons ? 1 : 0;
            create(chars, hashCons, k);
        }
        else if (countVow > countCons) {
            create(chars, hashVow, 0);
            create(chars, hashCons, 1);
        } else {
            create(chars, hashVow, 1);
            create(chars, hashCons, 0);
        }


        return new String(chars);
    }

    private static int getFirstOccurrence(int[] hash) {
        for (int i = 0; i < 26; i++) {
            if(hash[i] > 0) {
                return i;
            }
        }
        return 0;
    }

    private static void create(char[] chars, int[] hash, int k) {
            for (int i = 0; i < 26; ) {
                if(hash[i] > 0) {
                    chars[k] = (char)(i + 'a');
                    k++; k++;
                    hash[i]--;
                } else {
                    i++;
                }
            }
    }
}
