package GFG30days;

public class absDiffDivByK {
    
    static long countPairs(int n, int[] arr, int k) {
		// code here
		int map[] = new int[k];
		for(int x : arr)
		    map[x % k]++;
		    
		int ans = 0;
		for(int i = 0; i < k; i++) {
		    
		    ans += (map[i] * (map[i]-1))/2;
		}
		return ans;
	}
}
