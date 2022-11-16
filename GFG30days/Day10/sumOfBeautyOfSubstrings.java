package GFG30days.Day10;

public class sumOfBeautyOfSubstrings {
    
    public static int findBeauty(int array[]) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int c : array) {
            if(c == 0) continue;
            max = Math.max(max, c);
            min = Math.min(min, c);
        }
        return max - min;
    }
    
    public static int beautySum(String s) {
        
        int result = 0;
        for(int num = 0; num < s.length(); num++) {
            int array[] = new int[26];
            for(int i = num; i < s.length(); i++) {
                array[s.charAt(i) - 'a']++;
                
                result += findBeauty(array);
            }
        }
        return result;
    }
}
