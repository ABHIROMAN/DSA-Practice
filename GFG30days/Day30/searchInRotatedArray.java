package GFG30days.Day30;

public class searchInRotatedArray {
    
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        
        if(l > h) return -1;
        
        int mid = (l + h) / 2;
        
        if(A[mid] == key) return mid;
        
        if(A[l] <= A[mid]) {
            
            if(key >= A[l] && key <= A[mid]) {
                
                return search(A, l, mid-1, key);
            }
            return search(A, mid+1, h, key);
        }
        
        if(key >= A[mid] && key <= A[h]) {
            
            return search(A, mid+1, h, key);
        }
        return search(A, l, mid-1, key);
    }
}
