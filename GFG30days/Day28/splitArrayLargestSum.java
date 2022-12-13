package GFG30days.Day28;

public class splitArrayLargestSum {
    
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int sum = 0, ans = 1;
        
        for(int i : arr) {
            sum += i;
        }
        
        int low = 0, high = sum;
        
        while(low <= high) {
            
            int mid = low + (high-low)/2;
            
            if(isSafe(mid, arr, N, K)) {
                
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
        
    }
    
    static boolean isSafe(int mid, int arr[], int N, int K) {
        
        int prevSum = 0;
        
        int partition = 0;
        
        for(int i = 0; i < N; i++) {
            
            if(prevSum + arr[i] <= mid) 
            
                prevSum += arr[i];
            
            else {
                prevSum = arr[i];
                
                if(prevSum > mid) 
                    return false;
                    
                partition++;
            }
            
            if(partition == K) return false;
        }
        return true;
    }
}
