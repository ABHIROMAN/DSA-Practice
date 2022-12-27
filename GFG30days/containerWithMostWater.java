package GFG30days;

public class containerWithMostWater {
    
    long maxArea(int arr[], int len){
        // Code Here
        if(len == 1) return 0;
        
        int left = 0, right = len - 1;
        long ans = 0;
        
        while(left < right) {
            
            int base = right - left;
            int smallVertical = Math.min(arr[left], arr[right]);
            
            ans = Math.max(ans, base * smallVertical);
            
            if(arr[left] < arr[right]) {
                left++;
            }
            else {
                right--;
        }
    }
    return ans;
  }

}
