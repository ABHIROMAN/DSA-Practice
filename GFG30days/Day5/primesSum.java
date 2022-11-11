package GFG30days.Day5;

public class primesSum {

    static boolean isPrime(int n) {

        if(n <= 1) return false;

        for(int i = 2; i<= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    static String isSumOfTwo(int N) {

        if(N < 4) return "No";

        if(N % 2 == 0) return "Yes";

        if(isPrime(N-2) == true) return "Yes";

        else return "No";
    }
    
}
