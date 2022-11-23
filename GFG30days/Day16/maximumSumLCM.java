package GFG30days.Day16;

public class maximumSumLCM {

    static boolean isPrime(int n) {

        int x = (int)Math.sqrt(n);

        for(int i = 2; i <= x; i++) {

            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long maxSumLCM(int n) {

        if(n == 1) return 1;

        if(isPrime(n)) return n + 1;

        long out = 0;

        for(int i = 1; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) {
                out += n / i;

                if(i != n / i) {
                    out += i;
                }
            }
        }
        return out;

    }
    
}
