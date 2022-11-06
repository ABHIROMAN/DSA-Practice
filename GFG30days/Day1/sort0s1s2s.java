package GFG30days.Day1;

public class sort0s1s2s {

    public static void sort012(int a[], int n) {
        
        int start = 0;
        int i = 0;
        int end = n - 1;
        
        while(i <= end && start<end) {
            if(a[i] == 0) {
                a[i] = a[start];
                a[start] = 0;
                start++;
                i++;
            }
            else if(a[i] == 2) {
                a[i] = a[end];
                a[end] = 2;
                end--;
            }
            else{
                i++;
            }
        }
    }    
}
