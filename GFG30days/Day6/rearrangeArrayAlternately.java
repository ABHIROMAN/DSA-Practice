package GFG30days.Day6;

public class rearrangeArrayAlternately {

    public static void rearrange(long arr[], int n) {

        long a[] = new long[n];

        int j = n - 1; int k = 0;

        for(int i = 0; i < n; i++) {

            if(i % 2 != 0) {
                a[i] = arr[k];
                k++;
            }
            else {
                a[i] = arr[j];
                j--;
            }
        }
        for(int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
    }
    
}
