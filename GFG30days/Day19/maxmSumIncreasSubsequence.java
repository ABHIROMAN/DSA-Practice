package GFG30days.Day19;

public class maxmSumIncreasSubsequence {
    
    public int maxSumIS(int arr[], int n)  {  
	    
	    int i, j, max = 0;
        int dp[] = new int[n];
 
        /* Initialize dp values
           for all indexes */
        for (i = 0; i < n; i++)
            dp[i] = arr[i];
 
        /* Compute maximum sum values
           in bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] &&
                    dp[i] < dp[j] + arr[i])
                    dp[i] = dp[j] + arr[i];
 
        /* Pick maximum of all
           dp values */
        for (i = 0; i < n; i++)
            if (max < dp[i])
                max = dp[i];
 
        return max;
    }
}
