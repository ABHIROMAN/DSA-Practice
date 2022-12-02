package GFG30days.Day21;

import java.util.*;

public class medianInRowWiseMat {

    int median(int matrix[][], int R, int C) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < R; i++) {

            for(int j = 0; j < C; j++) {

                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        return arr.get(arr.size()/2);
    }
    
}
