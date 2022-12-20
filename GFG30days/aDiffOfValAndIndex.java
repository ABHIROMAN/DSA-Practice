package GFG30days;

public class aDiffOfValAndIndex {
    
    public static int maxDistance(int arr[], int n) {

        int ans = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {

            max = Math.max(max, arr[i] - 1);
            min = Math.min(min, arr[i] + 1);

            int v1 = (arr[i] + i) - min;
            int v2 = max - (arr[i] - i);

            ans = Math.max(ans, Math.max(v1,v2));
        }
        
        return ans;
    }
}
