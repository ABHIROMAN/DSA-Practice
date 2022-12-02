package GFG30days.Day21;

public class checKIfPossibleToConvertString {
    
    int isItPossible(String S, String T, int M, int N) {
       
        if(M != N) return 0;
        
        int i = 0; 
        int j = 0;
        
        while(i < M) {
            
            while(i < M && S.charAt(i) == '#') i++;
            
            while(j < N && T.charAt(j) == '#') j++;
            
            if(i >= M && j < N) return 0;
            if(j >= N && i < M) return 0;
            
            if(i < M && j < N && (S.charAt(i) == T.charAt(j))) {
                
                if(S.charAt(i) == 'A' && j > i) return 0;
                if(S.charAt(i) == 'B' && j < i) return 0;
            }
            
            if(i < M && j < N && (S.charAt(i) != T.charAt(j))) return 0;
            i++;
            j++;
        }
        return 1;
     }
};
