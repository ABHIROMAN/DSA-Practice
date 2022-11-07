package GFG30days.Day2;

public class zigZagArray {

    void swap(int arr[], int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

    void zigZag(int arr[], int n) {

        for(int i = 0; i<n-1; i++) {
            if(i % 2 == 0) {
                if(arr[i] == arr[i+1]) {
                    swap(arr, i, i+1);
                }
            } else {
                if(arr[i] < arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
        }
    }
    
}
