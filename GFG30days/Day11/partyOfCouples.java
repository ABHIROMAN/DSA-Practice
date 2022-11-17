package GFG30days.Day11;

public class partyOfCouples {
    
    static int findSingle(int N, int arr[]){
        
        int sum = 0; 
        
        for(int i = 0; i < N; i++) {
            
            sum = sum ^ arr[i];
        }
        
        return sum;
    }
}
