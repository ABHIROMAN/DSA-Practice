package GFG30days.Day5;

public class minimumNumberOfJumps {

    static int minJumps(int arr[]) {

        if(arr.length == 1) return 0;

        if(arr[0] == 0) return -1;

        int maxSteps = arr[0];
        int steps = arr[0];
        int totalJumps = 1;

        for(int i = 1; i < arr.length; i++) {

            if(i == arr.length - 1) return totalJumps;
            maxSteps = Math.max(maxSteps, arr[i] + 1);
            steps--;

            if(steps == 0) {

                totalJumps++;
                if(i >= maxSteps) return 1;
                steps = maxSteps - i;
            }
        }
        return -1;
    }
    
}
