package GFG30days.Day23;

public class arrayToBST {
    
    int i = 0;
    
    public void tree(int nums[], int left, int right, int arr[]) {
        
        if(left > right) return;
        
        int mid = left + (right-left)/2;
        arr[i++] = nums[mid];
        tree(nums, left, mid-1, arr);
        tree(nums, mid+1, right, arr);
    }
    
    public int[] sortedArrayToBST(int[] nums) {
        // Code here 
        int arr[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        tree(nums, left, right, arr);
        return arr;
    }
}
