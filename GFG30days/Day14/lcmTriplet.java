package GFG30days.Day14;

public class lcmTriplet {
    
    long lcmTriplets(long n) {
        
        if(n<=2) return n;
        if(n%2==1) return n*(n-1)*(n-2);
        else{
            if(n%3==0){
                return (n-1)*(n-2)*(n-3);
            }
            else{
                return n*(n-1)*(n-3);
            }
        }
    }
}
