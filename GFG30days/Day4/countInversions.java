package GFG30days.Day4;

public class countInversions {

    static long inversionCount(long arr[], long N){
        
        return sort(arr,0,(int)N-1);
    }
    static long sort(long[] arr, int left, int right){
        
        long count = 0;
        
        if(left < right){
            
            int mid = left + (right - left)/2;
            
            count += sort(arr, left, mid);
            count += sort(arr, mid+1, right);
            count += merge(arr, left, mid, right);
            
        }
        return count;
    }
    static long merge(long[] arr, int left, int mid, int right){
        
        
        int n1 = mid-left+1;
        int n2 = right-mid;
        
        long[] l1 = new long[n1];
        long[] l2 = new long[n2];
        
        for(int i=0; i< n1; i++) l1[i] = arr[i+left];
        for(int j=0; j<n2; j++) l2[j] = arr[j+mid+1];
        
        int i=0,j=0,k=left;
        long count =0;
        
        while(i < n1 && j< n2){
            
            if(l1[i] <= l2[j])
                arr[k++] = l1[i++];
            else{
                arr[k++] = l2[j++];
                count += n1-i;
            }
                
            
        }
        
        while(i<n1)
            arr[k++] = l1[i++];
        while(j<n2)
            arr[k++] = l2[j++];
        
       return count;
    }   
    
}
