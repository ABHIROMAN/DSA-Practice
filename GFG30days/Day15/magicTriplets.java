package GFG30days.Day15;

public class magicTriplets {
    
    public int countTriplets(int[] nums){
        
        int n = nums.length;
        
        if(n <= 2) return 0; //As there will be no triplets
        
        int count = 0;
        
        for(int i = 0; i < n-1; i++) {
            
            //for each index count the smaller elements on left side
            int small = 0;
            int large = 0;
            
            for(int j = 0; j < i; j++) {
                
                if(nums[j] < nums[i]) {
                    small++;
                }
            }
            
            //for each index count the larger elements on right side
            for(int k = i + 1; k < n; k++) {
                
                if(nums[k] > nums[i]) {
                    large++;
                }
            }
            
            count += small * large; //Adding the number of triplets
        }
        
        return count;
        
    }
}
