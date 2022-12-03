package GFG30days.Day22;

import java.util.*;

public class aggressiveCows {
    
    public static boolean canPlace(int stalls[],int k,int dis,int n){

        int first=stalls[0];

        int count =1;

        for(int i=1;i<n;i++){

            if(stalls[i]-first>=dis){

                first=stalls[i];

                count++;

            }

            if(k==count){

                return true;

            }

        }

        return false;

    }
    
    public static int solve(int n, int k, int[] stalls) {
        
        Arrays.sort(stalls);

        int i=1,j=stalls[n-1]-stalls[0];

        int result=0;

        while(i<=j){

            int mid=i+(j-i)/2;

            if(canPlace(stalls,k,mid,n)){

                result=mid;

                i=mid+1;

            }

            else{

                j=mid-1;

            }

        }

        return result;

    }
}
