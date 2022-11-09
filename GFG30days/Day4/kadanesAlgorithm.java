package GFG30days.Day4;

public class kadanesAlgorithm {

    long maxSubarraySum(int arr[], int n) {

        long maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for(int i = 0; i < n; i++) {

            maxEndingHere = maxEndingHere + arr[i];

            if(maxSoFar < maxEndingHere) {

                maxSoFar = maxEndingHere;
            }
            if(maxEndingHere < 0) {

                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}