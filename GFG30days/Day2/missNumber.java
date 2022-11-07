package GFG30days.Day2;

public class missNumber {

    int missingNumber(int array[], int n) {

        int temp = 0;

        int sum = n * (n+1) / 2;

        for(int i = 0; i < array.length; i++) {
            temp += array[i];
        }

        return sum - temp;
    }
    
}
