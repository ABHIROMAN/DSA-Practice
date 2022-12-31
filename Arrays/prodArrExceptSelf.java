package Arrays;

public class prodArrExceptSelf {
    
    // Using extra Space
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int arr[] = new int[n];

        int right = 1, left = 1;

        for(int i = 0; i < n; i++) {
            arr[i] = left;
            left = left * nums[i];
        }

        for(int i = n-1; i >= 0; i--) {
            arr[i] *= right;
            right = right * nums[i];
        }
        return arr;
    }

    public int[] productExceptSelfOptimised(int[] nums) {

        int n = nums.length;
        int output[] = new int[n];

        for(int i = 0; i < n-1; i++) {

            output[i+1] = output[i] * nums[i];
        }

        for(int i = n-2; i >= 0; i--) {

            output[i] = nums[i + 1] * output[i];
            nums[i] = nums[i] * nums[i+1];
        }
        return output;
    }
}
