package GFG30days.Day5;

public class trappingRainWater {

    static long trappingWater(int arr[], int n) {

        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        right[n-1] = arr[n-1];

        for(int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }
        
        for(int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }
        long sum = 0;
        int res[] = new int[n];

        for(int i = 0; i < n; i++) {
            res[i] = Math.min(left[i], right[i]);
            res[i] -= arr[i];
            if(res[i] < 0) res[i] = 0;
            sum += res[i];
        }
        return sum;
    }
    
}
