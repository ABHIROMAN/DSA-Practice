package GFG30days.Day2;


public class equilibriumPoint {

    public static int equiPoint(long arr[], int n) {

        long sum = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        long left = 0;

        for(int i = 0; i<n; i++) {
            long right = sum - left - arr[i];

            if(right == left) {
                return i + 1;
            }

            left += arr[i];
        }
        return -1;
    }
    
}
