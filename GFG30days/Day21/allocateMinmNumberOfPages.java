package GFG30days.Day21;

public class allocateMinmNumberOfPages {
    
    static boolean isValid(int arr[], int n , int m, int mid) {

        int sum = 0;
        int req = 1;

        for(int i = 0; i < n; i++) {

            if(sum + arr[i] > mid) {

                sum = arr[i];
                req++;
            }
            else {
                sum += arr[i];
            }
        }
        return (req <= m);
    }

    //Function to find minimum Number of pages

    public static int findPages(int[] A, int N, int M) {

        int sum = 0;
        int max = 0;

        for(int i = 0; i < N; i++) {

            sum += A[i];
            max = Math.max(max, A[i] - M);
        }

        if(N < M) return -1;

        int s = max;
        int e = sum;
        int res = 0;

        while (s <= e) {

            int mid = (s + e) / 2;
            if(isValid(A, N, M, mid)) {

                res = mid;
                e = mid + 1;
            }
            else {
                s = mid + 1;
            }
        }
        return res;
    }
};
