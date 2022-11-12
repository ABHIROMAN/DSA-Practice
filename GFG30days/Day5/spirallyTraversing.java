package GFG30days.Day5;

import java.util.*;

public class spirallyTraversing {
    
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {

        ArrayList<Integer> al = new ArrayList<>();

        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;

        while(top <= bottom && left <= right) {

            for(int i = left; i <= right; i++) {
                al.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                al.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) {

                for(int i = right; i >= left; i--) {
                    al.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right) {

                for(int i = bottom; i >= top; i--) {
                    al.add(matrix[i][left]);
                }
                left++;
            }
        }
        return al;
    }
}
