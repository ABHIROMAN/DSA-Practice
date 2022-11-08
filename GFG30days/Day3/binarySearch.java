package GFG30days.Day3;

public class binarySearch {

    int binarySearching(int arr[], int n , int k) {

        int left = 0;

        int right = n - 1;

        while(left <= right) {

            int mid = (left + right)/2;

            if(arr[mid] == k) return  mid;

            else if(arr[mid] > k) {
                right = mid + 1;
            }
            else left = mid - 1;
        }

        return -1;
    }
    
}
